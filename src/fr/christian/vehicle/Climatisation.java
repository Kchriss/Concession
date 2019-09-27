package fr.christian.vehicle;

public class Climatisation implements Option {

	private double prix=2.0;
	public Climatisation() {
		// TODO Auto-generated constructor stub
	}

	public Climatisation(double prix) {
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
		return "Climatisation [prix=" + prix + "]";
	}


}
