package metier;

public class ScooterElectrique extends Scooter {

	public ScooterElectrique(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Scooter �lectrique de mod�le " + modele + ", de couleur " + couleur + ", de puissance "
				+ puissance);		
	}

}
