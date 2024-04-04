public class CaseBase implements Case {

    private Joueur joueur;
    private final int numero;


    public CaseBase(int num) {
        this.numero = num;
        this.joueur = null;
    }

    @Override
    public boolean peutEtreQuittee() {
        /** retourne vrai si et seulement si le joueur peut quitter la case 
     * librement. Dans le cas contraire il doit attendre qu'un autre joueur
     * atteigne cette case et ou bien il doit attendre un certain nombre de
     * tour de jeu.
     */
        return true;
    }

    @Override
    public int getIndex() {
        return this.numero;
    }

    /** retourne le numéro de la cellule réellement atteinte lorsqu'un
     * joueur a atteint cette case.
    * @param jeteDes le résultat du jeté de dés quand le joueur est sur cette case
    * @return le numéro de la cellule effectivement atteinte par le joueur
    * lorsque qu'il atteint cette case après son jeté de dés
    */
    @Override
    public int consequence(int jeteDes) {
        return 1;
    }

    @Override
    public boolean estOccupee() {
        if(this.joueur == null) {
            return false;
        }
        return true;
    }

    @Override
    public void setJoueur(Joueur joueur) {
        if(this.estOccupee()) {
            this.joueur = joueur;
        }
    }

    @Override
    /** mets à jour cette cellule avec ce joueur ou null */
    public Joueur getJoueur() {
        return this.joueur;
    }
}
