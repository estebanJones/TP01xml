package main.jackson.indirection;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import main.jackson.entities.Societe;

@Component
public class JacksonDeserializerWrapper {
	private static ObjectMapper objectMapper;

	public JacksonDeserializerWrapper() {

	}

	public static List<Societe> getValueSociete(String fileName)
			throws JsonParseException, JsonMappingException, IOException {
		objectMapper = new ObjectMapper();
		CollectionType collType = objectMapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		return objectMapper.readValue(new File(fileName), collType);
	}

	public static void writeValue(String fileName, Societe societe)
			throws JsonParseException, JsonMappingException, IOException {
		objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File(fileName), societe);
	}
}
