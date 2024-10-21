package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		System.out.println("(Marco) : J'ai tout perdu !! Le monde est trop injuste...");
		marco.recevoir(15);
		System.out.println("(Marco) : 15 sous! Je te remercie généreux donateur ! ");
		marco.boire();
	}
}
