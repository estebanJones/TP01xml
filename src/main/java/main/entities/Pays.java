package main.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="un_pays")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pays {
	@XmlElement
	private String nom;
	@XmlElement(name="date_releve")
	private DateReleve dateReleve;
	@XmlElement(name="donnees_demographique")
	private DonneesDemographique donneesDemographique;
	@XmlElement(name="donnees_economique")
	private DonneesEconomique donneesEconomique;
	
	public Pays() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Pays(String nom) {
		this.nom = nom;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public DateReleve getDateReleve() {
		return dateReleve;
	}

	public void setDateReleve(DateReleve dateReleve) {
		this.dateReleve = dateReleve;
	}

	public DonneesDemographique getDonneesDemographique() {
		return donneesDemographique;
	}

	public void setDonneesDemographique(DonneesDemographique donneesDemographique) {
		this.donneesDemographique = donneesDemographique;
	}

	public DonneesEconomique getDonneesEconomique() {
		return donneesEconomique;
	}

	public void setDonneesEconomique(DonneesEconomique donneesEconomique) {
		this.donneesEconomique = donneesEconomique;
	}
}
