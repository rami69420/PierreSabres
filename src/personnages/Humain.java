package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

	// constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	// Getteur pour le nom
	public String getNom() {
		return nom;
	}

	// Get / Set pour l'argent
	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	// Méthode pour dire bonjour
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}
	
	// Méthode pour boire
	public void boire() {
		parler("Mmmmh, un bon verre de" + boissonFavorite + " ! GLOUP !");
	}
	
	// Méthode pour acheter des trucs
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			argent -= prix; // diminue l'argent du cout du bien
			parler("J'ai acheté un(e)" + bien + "pour" + prix + "sous.");
		} else {
			parler("Je n'ai pas assez d'argent pour acheter ce(tte) " + bien + "...");
		}
	}
	
	// Méthode pour gagner de l'argent
	private void gagnerArgent(int gain) {
		argent += gain;
		parler("J'ai gagné" + gain + "sous !!");
	}
	
	// Méthode pour perdre des sous
	private void perdreArgent(int perte) {
		argent -= perte;
		parler("J'ai perdu" + perte + "sous...");
	}

	// Méthode pour faire parler un Humain
	protected void parler(String texte) {
        System.out.println(texte);
	}
}
