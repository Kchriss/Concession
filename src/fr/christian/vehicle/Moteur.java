package fr.christian.vehicle;

public abstract class Moteur {
private TypeMoteur type;
private String cylindre;
private Double prix;

public Moteur() {
	super();	
}

public Moteur(String cylindre, Double prix) {
	super();
	this.cylindre = cylindre;
	this.prix = prix;
}


public TypeMoteur getType() {	
	return type;
}

public void setType(TypeMoteur type) {
	this.type = type;
}

public String getCylindre() {
	return cylindre;
}
public void setCylindre(String cylindre) {
	this.cylindre = cylindre;
}
public abstract Double getPrix();


@Override
public String toString() {
	return "Moteur [type=" + type + ", cylindre=" + cylindre + ", prix=" + prix + "]";
}



}
