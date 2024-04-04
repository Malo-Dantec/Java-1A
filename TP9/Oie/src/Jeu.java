import java.util.List;
import java.util.ArrayList;

public class Jeu {
    private List<Joueur> joueurs;
    private Joueur joueurCourant;

    public Jeu(Plateau plateau){

    }

    public void ajouteJoueur(String nom) {
      this.joueurs.add(new Joueur(nom));
    }
    
    /** retour arrière si le numéro dépasse le nombre de cases du plateau */
    private int depasseNumero(int numero) {
    // TODO
    }

    public Joueur prochainJoueur() {

    }

    public void jouer() {
        boolean aGagne = false;
        Joueur joueur = null;
        while (! aGagne) {

            if(joueur.getCase().getIndex() == 64) {
              aGagne = true;
              System.out.println(joueur+ " a gagné.");
            }
        }
    }
}