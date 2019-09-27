package fr.christian.vehicle;

public class MoteurHybride extends Moteur {

	private Double prix;

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.HYBRIDE);
		this.prix=prix;
	}

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}

}
