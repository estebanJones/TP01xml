package main.jackson.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChiffreAffaire {
	@JsonProperty
	private String annee;
	@JsonProperty
	private double chiffreAffaire;
	
	
	public ChiffreAffaire() {
		super();
	}
	public ChiffreAffaire(String annee, double chiffreAffaire) {
		super();
		this.annee = annee;
		this.chiffreAffaire = chiffreAffaire;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
}
