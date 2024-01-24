public class Personnage {
    private String nom;
    private int tailleDeBarbe;
    private int tailleDesOreilles;
    public Personnage(String n, int b, int o) {
        this.nom = n;
        this.tailleDeBarbe = b;
        this.tailleDesOreilles = o;
    }
    public String getNom() {
        return this.nom;
    }
    public int getBarbe() {
        return this.tailleDeBarbe;
    }
    public int getTailleDesOreilles() {
        return this.tailleDesOreilles;
    }
}