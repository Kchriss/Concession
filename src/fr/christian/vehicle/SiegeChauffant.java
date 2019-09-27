package fr.christian.vehicle;

public class SiegeChauffant implements Option {

	private double prix=4.0;
	public SiegeChauffant() {
		// TODO Auto-generated constructor stub
	}

	public SiegeChauffant(double prix) {
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
		return "SiegeChauffant [prix=" + prix + "]";
	}

}
