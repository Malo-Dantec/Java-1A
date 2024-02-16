public class Sorcier {
    private String nom;
    private int courage;
    private int sagesse;
    private Maison maison;

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


    
    public void setMaison(Maison maison) {
        this.maison = maison;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }



    public boolean estCourageux() {
        return this.courage > 8;
    }

}
