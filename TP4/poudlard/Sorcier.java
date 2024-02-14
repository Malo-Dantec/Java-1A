public class Sorcier {
    private String nom;
    private int courage;
    private int sagesse;

    public Sorcier(String nom, int courage, int sagesse) {
        this.nom = nom;
        this.courage = courage;
        this.sagesse = sagesse;
    }

    public String getNom() {
        return this.nom;
    }

    public int getCourage() {
        return this.courage;
    }

    public int getSagesse() {
        return this.sagesse;
    }

    public boolean estCourageux() {
        return this.courage > 8;
    }
}
