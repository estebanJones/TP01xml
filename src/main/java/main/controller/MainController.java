package main.controller;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import main.entities.LosPaises;
import main.entities.Pays;


public class MainController {
	public static void main(String... args) {
		Unmarshaller u;
		try {
			//			UNMARSHALL            \\
			JAXBContext nc = JAXBContext.newInstance(LosPaises.class);
			u = nc.createUnmarshaller();
			LosPaises p =(LosPaises) u.unmarshal( new File( "C:\\Users\\Jordan\\Documents\\eclipse-workspace\\SpringSecurity\\TP01.xml" ) );
			p.getPays().forEach(el -> {
				System.out.println(el.getDateReleve().getValue());
			});
			//!!			UNMARSHALL            !!\\
			//			MARSHALL            \\
			Marshaller marshaller = nc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			LosPaises paises = new LosPaises();
			paises.getPays().add(new Pays("Algeriiiiiie"));
			marshaller.marshal(paises, new File( "C:\\Users\\Jordan\\Documents\\eclipse-workspace\\SpringSecurity\\TP01.xml" ));
			
			
			// JSON
			
			
			//!!			MARSHALL            !!\\
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
