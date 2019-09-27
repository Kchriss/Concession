package fr.christian.vehicle;

import java.util.List;

public class A300B extends Vehicule {

	public A300B() {
		super();
		this.setNomMarque(Marque.CITROEN);
	}

	public A300B(List<Option> options) {
		super(options);
		this.setNomMarque(Marque.RENAULT);
	}

	public A300B(Moteur moteur) {
		super(moteur);
		this.setNomMarque(Marque.RENAULT);
	}
	public A300B(String immatriculation) {
		super(immatriculation);	
		this.setNomMarque(Marque.RENAULT);
	}
}
