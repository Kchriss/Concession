package fr.christian.vehicle;

import java.util.List;

public class D4 extends Vehicule {

	public D4() {
		super();
		this.setNomMarque(Marque.CITROEN);
	}

	public D4(List<Option> options) {
		super(options);
		this.setNomMarque(Marque.RENAULT);
	}

	public D4(Moteur moteur) {
		super(moteur);
		this.setNomMarque(Marque.RENAULT);
	}
	public D4(String immatriculation) {
		super(immatriculation);	
		this.setNomMarque(Marque.RENAULT);
	}
}
