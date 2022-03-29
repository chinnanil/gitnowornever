package org.selenium.pom.utils;

import java.io.IOException;
import java.io.InputStream;

import org.selenium.pom.objects.BillingAddress;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtils {
public static <T> T deserializeJson(String filePath,Class<T> T) throws IOException {
	InputStream is = JacksonUtils.class.getClassLoader().getResourceAsStream(filePath);

	ObjectMapper objectMapper = new ObjectMapper();
	
return	objectMapper.readValue(is , T);
}
}
