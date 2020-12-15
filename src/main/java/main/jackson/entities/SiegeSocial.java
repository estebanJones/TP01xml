package main.jackson.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SiegeSocial {
	@JsonProperty
	private String nom;
	@JsonProperty
	private String montagne;
	@JsonProperty
	private String etat;
	@JsonProperty
	private String pays;
	
	
	public SiegeSocial(String nom, String montagne, String etat, String pays) {
		super();
		this.nom = nom;
		this.montagne = montagne;
		this.etat = etat;
		this.pays = pays;
	}
	public SiegeSocial() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMontagne() {
		return montagne;
	}
	public void setMontagne(String montagne) {
		this.montagne = montagne;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
}
