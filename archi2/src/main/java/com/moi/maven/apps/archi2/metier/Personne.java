package com.moi.maven.apps.archi2.metier;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	private String nom, prenom;
	private int age;
	private List<Voiture> mesVoitures = new ArrayList<Voiture>();
	
	public String getNom() {
		return nom;
	}
	public List<Voiture> getMesVoitures() {
		return mesVoitures;
	}
	public void setMesVoitures(List<Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}
