package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public int getHonneur() {
		return honneur;
	}

	// Constructeur
	public Ronin(String nom, int argent, String boissonFavorite) {
		super(nom, boissonFavorite, argent);
	}

	// Méthode pour donner 10% de son argent
	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		beneficiaire.recevoir(don);
		setArgent(getArgent() - don);
		parler("Marco prends ces " + don + " sous");
	}

	// Méthode pour provoquer un Yakuza en duel
	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur; // La force du Ronin est le double de son honneur
		if (force >= adversaire.getReputation()) {
			parler("(Roronoa) - Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("(Roronoa) - Je t’ai eu, petit Yakuza!");
			int gain = adversaire.perdre(); // Le Yakuza perd le duel
			setArgent(getArgent() + gain); // Le Ronin prend l'argent du Yakuza
			honneur++; // Le Ronin gagne en honneur
		} else {
			parler("(Roronoa) - J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup...");
			adversaire.gagner(getArgent()); // Le Yakuza gagne le duel et prend l'argent du Ronin
			honneur = Math.max(0, honneur - 1); // Le Ronin perd un point d'honneur, sans aller en dessous de 0
			setArgent(0); // Le Ronin perd tout son argent
		}
	}
}
