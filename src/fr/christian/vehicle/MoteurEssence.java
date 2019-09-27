package fr.christian.vehicle;

public class MoteurEssence extends Moteur {

	private Double prix;

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ESSENCE);
		this.prix=prix;
	}

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	
}
