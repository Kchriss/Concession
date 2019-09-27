package fr.christian.vehicle;

public class main {

	    public static void main(String[] args) {
	    	
	   	 Garage garage = new Garage();   
	   	 Garage garage1 = new Garage();
	   	 
	   	 Vehicule lag1 = new Lagouna("23 gvb 534");	   	 
	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 garage.addVoiture(lag1);
	   	 garage1.addVoiture(lag1);
	   	 
	   	 Vehicule A300B_2 = new A300B("32 hgh 969");
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 garage.addVoiture(A300B_2);
	   	 
	   	 Vehicule A300B_3 = new A300B("569 ghf 998");
	   	 A300B_3.setMoteur(new MoteurElectrique("1500 W", 1543d));
	   	 A300B_3.addOption(new Climatisation());	  
	   	 A300B_3.addOption(new SiegeChauffant());
	   	 garage1.addVoiture(A300B_3);
	   	 
	   	 Vehicule d4_1 = new D4("515 ghf 666");
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 garage.addVoiture(d4_1);   	 
	   	 
	   	 Vehicule lag2 = new Lagouna("565 plo 696");
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 garage.addVoiture(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B("858 iii 696");
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 garage.addVoiture(A300B_1);
	   	 garage1.addVoiture(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4("555 ggg 444");
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 garage.addVoiture(d4_2);
	   	 
	   	 Vehicule d4_3 = new D4("555 ggg 444");
	   	 d4_3.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_3.addOption(new SiegeChauffant());	   	 
	   	 d4_3.addOption(new GPS());
	   	 d4_3.addOption(new VitreElectrique());
	   	 garage1.addVoiture(d4_3);
	   	 
	   	 System.out.println("**********************");
	   	 System.out.println("***Stock du garage ***");
	   	 System.out.println("**********************");
	   	 System.out.println(garage);
	   	 
	   	 System.out.println("************************");
	   	 System.out.println("***Stock du garage 1 ***");
	   	 System.out.println("************************");
	   	 System.out.println(garage1);
	   	 
	   	 System.out.println("**********************************");
	   	 System.out.println("*** 'n' voiture les moins cher ***");
	   	 System.out.println("**********************************");
	   	 System.out.println(garage.getVoituresMoinsCher(2));
	   	
	    }
	}
