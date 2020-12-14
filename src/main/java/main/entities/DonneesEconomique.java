package main.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="donnees_economique")
@XmlAccessorType(XmlAccessType.FIELD)
public class DonneesEconomique {
	@XmlElement(name="pib")
	private Long pib;
	@XmlElement(name="monnaie")
	private String monnaie;
	 
	public DonneesEconomique() {

	}

	public Long getPib() {
		return pib;
	}

	public void setPib(Long pib) {
		this.pib = pib;
	}

	public String getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	 
	 
}
