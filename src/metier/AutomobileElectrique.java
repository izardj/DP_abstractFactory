package metier;

public class AutomobileElectrique extends Automobile {

	public AutomobileElectrique(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Automobile �lectrique de mod�le " + modele + ", de couleur " + couleur + ", de puissance "
				+ puissance + ", d'espace " + espace);
	}

}
