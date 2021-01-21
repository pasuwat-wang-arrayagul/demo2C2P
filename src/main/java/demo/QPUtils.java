package demo;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QPUtils {
	
	public static String generateJsonMessage(QPRequest request) throws JsonProcessingException {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        ObjectMapper objectMapper = new ObjectMapper();
        
        objectMapper.setDateFormat(df);
        return objectMapper.writeValueAsString(request);
	}


	public static void main(String[] args) throws JsonProcessingException {

        
		String jsonString = generateJsonMessage(new GenerateQPReq());
        
        System.out.println(jsonString);

    }
}
