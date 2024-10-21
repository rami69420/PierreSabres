package personnages;

import personnages.Ronin;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	// Constructeur
	public Yakuza(String nom, int argent, String boissonFavorite, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 0; // La réputation est initialisée à 0 par défaut
	}

	public int getReputation() {
		return reputation;
	}

	// Méthode pour extorquer un commerçant
	public void extorquer(Commercant victime) {
		int montantExtorque = victime.seFaireExtorquer();
		setArgent(getArgent() + montantExtorque); // Ajoute l'argent extorqué au Yakuza
		reputation++; // Augmente la réputation du Yakuza
		parler("J’ai piqué les " + montantExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche! Zehahahaha!!!");
	}

	// Méthode pour perdre un duel
	public int perdre() {
		setArgent(0); // Perd tout son argent
		reputation = Math.max(0, reputation - 1); // Perd un point de réputation, sans aller en dessous de 0
		parler("(Yaku) - J’ai perdu mon duel et tout mon argent, snif... J'ai déshonoré le clan " + clan + ".");
		return getArgent();
	}

	// méthode pour gagner un duel
	public void gagner(int gain) {
		setArgent(getArgent() + gain);
		reputation++;
		parler("(Yaku) - Ce ronin pensait vraiment battre Yaku le Noir du clan de Warsong ? Je l'ai dépouillé de ses sous");
	}
}
