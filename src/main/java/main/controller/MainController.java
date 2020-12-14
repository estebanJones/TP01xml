package main.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import main.entities.LosPaises;
import main.entities.Pays;


public class MainController {
	
	
	public static void main(String... args) {
		Unmarshaller u;
		try {
			JAXBContext nc = JAXBContext.newInstance(LosPaises.class);
			u = nc.createUnmarshaller();
			LosPaises p =(LosPaises) u.unmarshal( new File( "C:\\Users\\Jordan\\Documents\\eclipse-workspace\\SpringSecurity\\TP01.xml" ) );
			p.getPays().forEach(el -> {
				System.out.println(el.getDateReleve().getFormat());
				
			});
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
