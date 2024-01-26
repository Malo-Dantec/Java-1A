public class Vaisseau {
    private String nom;
    private int nombreDePassagers = 0;
    private int puissanceDeFeu;
    public Vaisseau(String nom, int puissance) {
        this.nom = nom;
        this.puissanceDeFeu = puissance;
    }
    public Vaisseau(String nom, int puissance, int passagers) {
        this.nom = nom;
        this.puissanceDeFeu = puissance;
        this.nombreDePassagers = passagers;
    }
    public String getNom() {
        return this.nom;
    }
    public int getNombrePassagers() {
        return this.nombreDePassagers;
    }
    public int getPuissance() {
        return this.puissanceDeFeu;
    }
    public boolean transportePassagers() {
        return this.nombreDePassagers > 0;
    }
}