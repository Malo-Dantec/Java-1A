/**
 * Main.java
 */
public class Main {	
	public static void main(String[] args) {	
		Jeu jeu = new Jeu(new Plateau());
		jeu.ajouteJoueur("bilbo");
		jeu.ajouteJoueur("frodo");
		jeu.ajouteJoueur("sam");
		jeu.jouer();
	}
}
