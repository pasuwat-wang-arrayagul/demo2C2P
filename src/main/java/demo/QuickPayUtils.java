package demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.text.SimpleDateFormat;

public class QuickPayUtils {

    public static String generateQPRequest(GenerateQuickPayRequest qpReq ) throws JsonProcessingException {
        String message =qpReq.getMessage();
        String secretKey = "QnmrnH6QE23N";

        String hashval = encryptHmacSHA1(secretKey , message);
        qpReq.setHashValue(hashval);

        QuickPayRequest request = new QuickPayRequest();
        request.setGenerateQPReq(qpReq);

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        ObjectMapper objectMapper = new ObjectMapper();
        String GenerateQPReq =  objectMapper.writeValueAsString(request);


        return GenerateQPReq;
    }

    public static String encryptHmacSHA1(String secret, String message) {
        String algorithm = "HmacSHA1";
        String hash = "";
        try {
            Mac sha1_HMAC = Mac.getInstance(algorithm);
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), algorithm);
            sha1_HMAC.init(secret_key);

            hash = Base64.encodeBase64String(sha1_HMAC.doFinal(message.getBytes()));
        } catch (Exception e) {
            System.out.println("Error");
        }
        return hash;
    }

    public static void main(String[] args) throws JsonProcessingException {
        String requestMsg = QuickPayUtils.generateQPRequest(new GenerateQuickPayRequest());
        System.out.println(String.format("Request %s",requestMsg));
    }
}
