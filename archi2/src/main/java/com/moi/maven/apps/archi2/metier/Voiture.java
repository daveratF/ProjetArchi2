package com.moi.maven.apps.archi2.metier;

public class Voiture {
	private int numVoiture;
	private String marque, concessionnaire;
	private Personne proprietaire;
	public int getNumVoiture() {
		return numVoiture;
	}
	public void setNumVoiture(int numVoiture) {
		this.numVoiture = numVoiture;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getConcessionnaire() {
		return concessionnaire;
	}
	public void setConcessionnaire(String concessionnaire) {
		this.concessionnaire = concessionnaire;
	}
	public Personne getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	@Override
	public String toString() {
		return "Voiture [numVoiture=" + numVoiture + ", marque=" + marque + ", concessionnaire=" + concessionnaire
				+ ", proprietaire=" + proprietaire + "]";
	}
	
	
}
