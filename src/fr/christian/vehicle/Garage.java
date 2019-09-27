package fr.christian.vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
private List<Vehicule> voitures= new ArrayList<Vehicule>();

public Garage() {
	super();
}

public Garage(List<Vehicule> voitures) {
	super();
	this.voitures = voitures;
}

public List<Vehicule> getVoitures() {
	return voitures;
}

public void setVoitures(List<Vehicule> voitures) {
	this.voitures = voitures;
	
}
public void addVoiture(Vehicule voit) {
	this.voitures.add(voit);
	voit.prixDeLaVoiture();
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Garage [voitures=");	
	builder.append(voitures);
	builder.append("]");
	
	return builder.toString();
}
public List<Vehicule> deleteLesVoituresEnDoublon(List<Vehicule> voitures1,List<Vehicule> voitures2) {
	
	for(int i=0;i<voitures1.size();i++) {
		for(Vehicule voit2:voitures2) {
			if ( voit2.getImmatriculation().equals(voitures1.get(i).getImmatriculation())) {
				voitures1.remove(i);
			}
		}		
	}
	return voitures1;	
}
public Double calculerValeurStock(){
	Double valeurStock=0.0;
		for(Vehicule voit:this.voitures) {
			valeurStock += voit.getPrix();
		}
			
	return valeurStock ;	
}


public List<Vehicule> getVoituresMoinsCher(int nombreDeVoitureMoinsCher) {
	List<Vehicule> sortedCars = voitures.stream()
			.sorted(Comparator.comparing(Vehicule::getPrix))
			.collect(Collectors.toList());
	return sortedCars.subList(0, nombreDeVoitureMoinsCher);	
	}

}
