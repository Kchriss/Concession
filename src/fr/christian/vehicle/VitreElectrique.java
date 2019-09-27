package fr.christian.vehicle;

public class VitreElectrique implements Option {

	private double prix=5.0;
	public VitreElectrique() {
		// TODO Auto-generated constructor stub
	}

	public VitreElectrique(double prix) {
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
		return "VitreElectrique [prix=" + prix + "]";
	}

}
