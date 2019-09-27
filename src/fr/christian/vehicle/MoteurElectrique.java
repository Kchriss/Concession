package fr.christian.vehicle;

public class MoteurElectrique extends Moteur {
	private Double prix;

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ELECTRIQUE);
		this.prix=prix;	
	}
	@Override
	public Double getPrix() {	
		return this.prix;
	}
}
