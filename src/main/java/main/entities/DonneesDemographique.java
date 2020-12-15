package main.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="donnees_demographique")
@XmlAccessorType(XmlAccessType.FIELD)
public class DonneesDemographique {
	@XmlElement(name="population")
	private Population population;
	@XmlElement(name="fecondite")
	private Fecondite fecondite;
	
	
	public DonneesDemographique() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Population getPopulation() {
		return population;
	}
	public void setNbPopulation(Population population) {
		this.population = population;
	}
	public Fecondite getFecondite() {
		return fecondite;
	}
	public void setFecondite(Fecondite fecondite) {
		this.fecondite = fecondite;
	}
	
	
}
