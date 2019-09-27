package fr.christian.vehicle;

public class BarreDeToit implements Option {

	private double prix=1.0;
	public BarreDeToit() {
		// TODO Auto-generated constructor stub
	}

	public BarreDeToit(double prix) {
		super();
		this.prix = prix;
	}

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}

	@Override
	public String toString() {
		return "BarreDeToit [prix=" + prix + "]";
	}


}
