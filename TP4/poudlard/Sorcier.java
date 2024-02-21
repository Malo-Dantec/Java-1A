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
        return this.getCourage() > 8;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Sorcier) {
            Sorcier sorcier = (Sorcier) obj;
            return this.getNom().equals(sorcier.getNom()) && this.getCourage() == sorcier.getCourage() && this.getSagesse() == sorcier.getSagesse();
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.getNom();
    }
}