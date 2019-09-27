package fr.christian.vehicle;

public class MoteurDiesel extends Moteur {

	private Double prix;

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.DIESEL);
		this.prix=prix;		
	}

	@Override
	public Double getPrix() {	
		return this.prix;
	}

}
