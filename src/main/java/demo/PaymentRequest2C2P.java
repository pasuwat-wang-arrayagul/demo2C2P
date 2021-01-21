package demo;

import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.*;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PaymentRequest2C2P {

    public static void main(String[] args) throws IOException {
        PaymentRequest2C2P request = new PaymentRequest2C2P();
        /*CloseableHttpResponse resonse = request.execute();

        try {
            System.out.println(resonse.getStatusLine());
            HttpEntity entity2 = resonse.getEntity();
            // do something useful with the response body
            String responseString = new BasicResponseHandler().handleResponse(resonse);
            System.out.println(responseString);

            // and ensure it is fully consumed
            EntityUtils.consume(entity2);
        } finally {
            resonse.close();
        }*/
    }

    private String merchantId = "JT04";
    private String secretKey = "QnmrnH6QE23N";
    private String description = "Just for Test 10,0000";
    private String orderPrefixID = "AP";
    private String currencyCd = "THB";
    private String timestamp = "20210121213500";
    private String amount = "000001000000";
    private String expiry = "20210122213500";

    private String currency = "764";

    private String version = "2.0";
    private String submitUrl = "http://demo2.2c2p.com/2C2PFrontEnd/QuickPay/DirectAPI";
    private String resultUrl = "http://localhost/devPortal/V3_UI_PHP_JT01_devPortal/result.php";
    private String paymentOption = "123";



    /*private CloseableHttpResponse execute() throws IOException {

        DefaultHttpClient httpclient = new DefaultHttpClient();
        httpclient.setRedirectStrategy(new DefaultRedirectStrategy() {
            public boolean isRedirected(HttpRequest request, HttpResponse response, HttpContext context)  {
                boolean isRedirect=false;
                try {
                    isRedirect = super.isRedirected(request, response, context);
                } catch (ProtocolException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (!isRedirect) {
                    int responseCode = response.getStatusLine().getStatusCode();
                    if (responseCode == 301 || responseCode == 302) {
                        return true;
                    }
                }
                return isRedirect;
            }
        });

        HttpPost httpPost = new HttpPost(submitUrl);

        String hashVal = generateHash();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("version", version));
        nvps.add(new BasicNameValuePair("merchant_id", merchantId));
        nvps.add(new BasicNameValuePair("currency", currency));
        nvps.add(new BasicNameValuePair("result_url_1", resultUrl));
        nvps.add(new BasicNameValuePair("payment_option", paymentOption));
        nvps.add(new BasicNameValuePair("payment_option", paymentOption));
        nvps.add(new BasicNameValuePair("hash_value", hashVal));
        nvps.add(new BasicNameValuePair("payment_description", paymentDesc));
        nvps.add(new BasicNameValuePair("order_id", orderId));
        nvps.add(new BasicNameValuePair("amount", amount));
        httpPost.setEntity(new UrlEncodedFormEntity(nvps));



        return httpclient.execute(httpPost);
    }

    private String generateHash() {
        //String message = version+merchantId+paymentDesc+orderId+currency+amount+resultUrl+paymentOption;

        HmacUtils.hmac
        return Security.encryptSha256(secretKey , message);
    }*/
}
