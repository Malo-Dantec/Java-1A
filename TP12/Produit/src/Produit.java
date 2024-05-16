public class Produit {
    private String nom;
    private double prixUnitaire;

    public Produit(String nom, double prixUnitaire) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    @Override
    public int compareTo(Produit produit) {
        return this.nom.compareTo(produit.nom);
    }

    @Override
    public String toString() {
        return this.nom + " pour " + this.prixUnitaire + "euro(s).";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Produit)) return false;
        Produit produit = (Produit) obj;
        return Double.compare(produit.prixUnitaire, prixUnitaire) == 0 && Objects.equals(nom, produit.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prixUnitaire);
    }
}