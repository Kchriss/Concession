package fr.christian.vehicle;

import java.util.List;

public class Lagouna extends Vehicule {
	
	public Lagouna() {
		super();
		this.setNomMarque(Marque.RENAULT);
	}

	public Lagouna(List<Option> options) {
		super(options);		
		this.setNomMarque(Marque.RENAULT);
	}

	public Lagouna(Moteur moteur) {
		super(moteur);
		this.setNomMarque(Marque.RENAULT);
	}

	public Lagouna(String immatriculation) {
		super(immatriculation);	
		this.setNomMarque(Marque.RENAULT);
	}
	
}
