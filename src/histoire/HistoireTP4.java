package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Commercant;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		System.out.println("(Marco) : J'ai tout perdu !! Le monde est trop injuste...");
		marco.recevoir(15);
		System.out.println("(Marco) : 15 sous! Je te remercie généreux donateur ! ");
		marco.boire();
		

		// Le yakuza extorque le commerçant
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		yakuLeNoir.direBonjour();
		System.out.println("(Yaku Le Noir) - Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println("(Yaku Le Noir) - Marco, si tu tiens à la vie file moi ta bourse !");
		yakuLeNoir.extorquer(marco);
		
		
		// Le Ronin fait un don
		Ronin roronoa = new Ronin("Roronoa", 60, "shochu");
		roronoa.direBonjour();
		roronoa.donner(marco);
		System.out.println("(Marco) - Je te remercie généreux donateur!");
		
		// Début du duel...
		roronoa.provoquer(yakuLeNoir);
	}
}
