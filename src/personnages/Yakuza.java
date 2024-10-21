package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	// Constructeur
	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 0; // intialisée à zéro
	}

	// Méthode pour extorquer un commerçant
	public void extorquer(Commercant victime) {
		int montantExtorque = victime.seFaireExtorquer();
		setArgent(getArgent() + montantExtorque); // ajt l'extorsion au yakuza
		reputation++;
		parler("J'ai piqué les " + montantExtorque + " sous de " + victime.getNom() + ", " + "ce qui me fait "
				+ getArgent() + " sous dans ma poche! zehahahaha!!");

	}
}