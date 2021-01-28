package demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;

public class QuickPayUtils {

	public static String generateQPRequest(GenerateQuickPayRequest qpReq) throws  Exception {
		
		String algorithm = "HmacSHA1";
		String message = qpReq.getMessage();
		System.out.println(message);
		String secretKey = "5E27D5B515EDB06EB07A0738A2DAC5BC2BDA7858970EE9CD1A377126E5535C13";

		String hashval = HMAC.hmacDigest(message, secretKey, algorithm);
		System.out.println(hashval);
		qpReq.setHashValue(hashval);

		QuickPayRequest request = new QuickPayRequest();
		request.setGenerateQPReq(qpReq);

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		ObjectMapper objectMapper = new ObjectMapper();
		String GenerateQPReq = objectMapper.writeValueAsString(request);
		System.out.println(GenerateQPReq);
		String encodeMsg = encodeBase64(GenerateQPReq);
		String responseTxt = execute(encodeMsg);
		System.out.println(decodeBase64(responseTxt));

		return responseTxt;
	}

	private static String encodeBase64(String requestMsg) {
		try {
			return Base64.encodeBase64String(requestMsg.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace(System.out);
		}
		return requestMsg;
	}
	
	private static String decodeBase64(String requestMsg) {
		return new String(Base64.decodeBase64(requestMsg));
	}

	private final String P_QUICKPAY_ENDPOINT = "qp.url.endpoint";
	
	private static String execute(String requestMsg) throws ClientProtocolException, IOException, Exception, NoSuchAlgorithmException {
		int timeout = 60;
		RequestConfig config = RequestConfig.custom()
		  .setConnectTimeout(timeout * 1000)
		  .setConnectionRequestTimeout(timeout * 1000)
		  .setSocketTimeout(timeout * 1000).build();
		
		CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();

		HttpPost httpPost = new HttpPost("https://t.2c2p.com/QuickPay/DirectAPI");
		//HttpPost httpPost = new HttpPost("http://demo2.2c2p.com/2C2PFrontEnd/QuickPay/DirectAPI");
		
		InputStream stream = new ByteArrayInputStream(requestMsg.getBytes("utf-8"));
		InputStreamEntity reqEntity = new InputStreamEntity(stream);
		reqEntity.setContentType("text/plain; charset=utf-8");
		httpPost.setEntity(reqEntity);
		//httpPost.addHeader("Accept", "application/json");
		
		CloseableHttpResponse response = httpclient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String responseTxt = "";
		if(responseEntity!=null) {
		    responseTxt = EntityUtils.toString(responseEntity);
		}
		
		return responseTxt;
	}

	public static void main(String[] args) throws JsonProcessingException {
		String requestMsg;
		try {
			requestMsg = QuickPayUtils.generateQPRequest(new GenerateQuickPayRequest());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
	}
}
