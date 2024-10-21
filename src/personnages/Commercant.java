package personnages;

public class Commercant extends Humain {
	// Constructeur
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	// Le commerçant se fait extorquer
	public int seFaireExtorquer() {
		int montantExtorque = getArgent();
		setArgent(0);
		parler("Le monde est vraiment trop injuste...");
		return montantExtorque;
	}
	
	// Le commerçant reçoit des sous
	public void recevoir(int argent) {
		setArgent(getArgent() + argent);
	}
}
