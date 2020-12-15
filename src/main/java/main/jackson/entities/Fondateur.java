package main.jackson.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fondateur {
	@JsonProperty
	private String nom;
	@JsonProperty
	private String prenom;
	@JsonProperty
	private String dateNaissance;
	@JsonProperty
	private String villeNaissance;
	@JsonProperty
	private String dp;
	
	
	public Fondateur(String nom, String prenom, String dateNaissance, String villeNaissance, String dp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.villeNaissance = villeNaissance;
		this.dp = dp;
	}

	public Fondateur() {

	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getVilleNaissance() {
		return villeNaissance;
	}
	public void setVilleNaissance(String villeNaissance) {
		this.villeNaissance = villeNaissance;
	}
	public String getDp() {
		return dp;
	}
	public void setDp(String dp) {
		this.dp = dp;
	}
	
	
}
