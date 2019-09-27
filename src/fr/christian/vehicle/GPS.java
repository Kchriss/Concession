package fr.christian.vehicle;

public class GPS implements Option {
	private double prix=3.0;
	public GPS() {
		
	}

	public GPS(double prix) {
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
		return "GPS [prix=" + prix + "]";
	}


	

}
