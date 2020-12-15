package main.jackson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import main.jackson.entities.ChiffreAffaire;
import main.jackson.entities.Fondateur;
import main.jackson.entities.SiegeSocial;
import main.jackson.entities.Societe;
import main.jackson.indirection.JacksonDeserializerWrapper;


public class MainJackson {
	private JacksonDeserializerWrapper jackson;
	
	private static String FILENAME_READ = "C:/Users/Jordan/Documents/eclipse-workspace/SpringSecurity/societe.json";
	private static String FILENAME_WRITE = "C:/Users/Jordan/Documents/eclipse-workspace/SpringSecurity/test_write.json";
	public MainJackson(JacksonDeserializerWrapper jackson) {
		this.jackson = jackson;
	}
	public static void main(String[] args) {
		try {
			List<Societe> societes = JacksonDeserializerWrapper.getValueSociete(FILENAME_READ);
			System.out.println(".------..------..------..------..------..------..------.     .------..------.     .------..------..------..------..------..------.\r\n" + 
					"|M.--. ||A.--. ||R.--. ||T.--. ||I.--. ||N.--. ||E.--. |.-.  |M.--. ||A.--. |.-.  |C.--. ||O.--. ||P.--. ||I.--. ||N.--. ||E.--. |\r\n" + 
					"| (\\/) || (\\/) || :(): || :/\\: || (\\/) || :(): || (\\/) ((5)) | (\\/) || (\\/) ((5)) | :/\\: || :/\\: || :/\\: || (\\/) || :(): || (\\/) |\r\n" + 
					"| :\\/: || :\\/: || ()() || (__) || :\\/: || ()() || :\\/: |'-.-.| :\\/: || :\\/: |'-.-.| :\\/: || :\\/: || (__) || :\\/: || ()() || :\\/: |\r\n" + 
					"| '--'M|| '--'A|| '--'R|| '--'T|| '--'I|| '--'N|| '--'E| ((1)) '--'M|| '--'A| ((1)) '--'C|| '--'O|| '--'P|| '--'I|| '--'N|| '--'E|\r\n" + 
					"`------'`------'`------'`------'`------'`------'`------'  '-'`------'`------'  '-'`------'`------'`------'`------'`------'`------'\r\n" + 
					"\r\n" + 
					"");
			societes.forEach(s -> System.out.println(s.getNom()));
			List<ChiffreAffaire> listChiffre = new ArrayList<>();
			List<Fondateur> listFondateur = new ArrayList<>();
			SiegeSocial siege = new SiegeSocial("SiegeA", "montagneA", "etatA", "paysA");
			Fondateur fondateur = new Fondateur("nomA", "prenomA", "dateA", "villeA", "dpA");
			ChiffreAffaire chiffre = new ChiffreAffaire("anneA", 12.22);
			listChiffre.add(chiffre);
			listFondateur.add(fondateur);
			Societe societe = new Societe("CriticalTechWork", siege, listFondateur, listChiffre);
			
			
			JacksonDeserializerWrapper.writeValue(FILENAME_WRITE, societe);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
