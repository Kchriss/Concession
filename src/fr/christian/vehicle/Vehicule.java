package fr.christian.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {
private Double prix=0.0;
private String nom;
private String immatriculation;
private List<Option> options=new ArrayList<Option>();
private Marque nomMarque;
private Moteur moteur;
public Vehicule(){
	super();
	this.nom = this.getClass().getSimpleName();	 
}

public Vehicule(String immatriculation) {
	super();
	this.immatriculation = immatriculation;
	this.nom = this.getClass().getSimpleName();	 
}

public Vehicule(List<Option> options) {
	super();
	this.options = options;
}
public Vehicule(Moteur moteur) {
	super();
	this.moteur = moteur;
}
public Double prixDeLaVoiture()
	{
	Double prixTotal = options.stream().mapToDouble(Option::getPrix).sum();
	prixTotal += moteur.getPrix();
	prix += prixTotal;
	return prix+prixTotal;
	}

public Double getPrix() {	
	return prix;
}

public void setPrix(Double prix) {
	
	this.prix = prix;
}
public String getNom() {
	return nom;
}

public String getImmatriculation() {
	return immatriculation;
}

public void setImmatriculation(String immatriculation) {
	this.immatriculation = immatriculation;
}

public List<Option> getOptions() {
	return options;
}
public void setOptions(List<Option> options) {
	this.options = options;
}

public void setNomMarque(Marque nomMarque) {
	this.nomMarque = nomMarque;
}

public Marque getNomMarque() {
	return nomMarque;
}

public void addOption(Option opt) {
 this.options.add(opt);
}


@Override
public String toString() {
	return "Vehicule"+"\n"+" [immatriculation= " +immatriculation+" prixVoiture=" + prix + ", nom=" + nom + ", options=" + options + ", nomMarque=" + nomMarque + ", moteur="
			+ moteur + "]";
}

public void setMoteur(Moteur moteur) {
	this.moteur=moteur;
	
}
 
}
