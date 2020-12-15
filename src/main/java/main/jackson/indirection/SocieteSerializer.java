//package main.jackson.indirection;
//
//import java.io.File;
//import java.io.IOException;
//
//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializerProvider;
//import com.fasterxml.jackson.databind.ser.std.StdSerializer;
//
//import main.jackson.entities.Societe;
//
//public class SocieteSerializer extends StdSerializer<Societe> {
//	private static ObjectMapper objectMapper;
//	protected SocieteSerializer() {
//		super(Societe.class);
//		// TODO Auto-generated constructor stub
//	}
//	
//
////	@Override
////	public Object serialize(Societe value, JsonGenerator gen, SerializerProvider provider) throws IOException {
////		gen.writeValue(new File("C:/Temp/monFichier.json"), value);
////		
////	}
//}
