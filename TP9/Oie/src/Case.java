/** Interface Case pour le "jeu de l'oie".
 * On rappelle qu'il ne peut y avoir qu'un joueur
 * par case et que la case de départ est numéroté 0
 */
public interface Case {
    public boolean peutEtreQuittee();
    public int getIndex();
    public int consequence(int jeteDes);
    public boolean estOccupee();
    public void setJoueur(Joueur joueur);
    public Joueur getJoueur();
}
