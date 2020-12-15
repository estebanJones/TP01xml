package main.jackson.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Societe {
	@JsonProperty
	private String nom;
	@JsonProperty
	private SiegeSocial siegeSocial;
	@JsonProperty
	private List<Fondateur> fondateurs;
	@JsonProperty
	private List<ChiffreAffaire> chiffresAffaire;
	
	public Societe(String nom, SiegeSocial siegeSocial, List<Fondateur> fondateurs,
			List<ChiffreAffaire> chiffresAffaire) {
		super();
		this.nom = nom;
		this.siegeSocial = siegeSocial;
		this.fondateurs = fondateurs;
		this.chiffresAffaire = chiffresAffaire;
	}
	
	public Societe() {
		super();
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public SiegeSocial getSiegeSocial() {
		return siegeSocial;
	}
	public void setSiegeSocial(SiegeSocial siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
	public List<Fondateur> getFondateurs() {
		return fondateurs;
	}
	public void setFondateurs(List<Fondateur> fondateurs) {
		this.fondateurs = fondateurs;
	}
	public List<ChiffreAffaire> getChiffresAffaire() {
		return chiffresAffaire;
	}
	public void setChiffreAffaire(List<ChiffreAffaire> chiffresAffaire) {
		this.chiffresAffaire = chiffresAffaire;
	}
}


