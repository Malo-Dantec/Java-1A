public class Magasin {
    private String nom;
    private boolean ouvertLundi;
    private boolean ouvertDimanche;

    public Magasin(String nom, boolean lundi, boolean dimanche) {
        this.nom = nom;
        this.ouvertLundi = lundi;
        this.ouvertDimanche = dimanche;
    }

    public String getNom() {
        return this.nom;
    }

    public boolean ouvertLundi() {
        return this.ouvertLundi;
    }

    public boolean ouvertDimanche() {
        return this.ouvertDimanche;
    }

    @Override
    public String toString() {
        String res = getNom();
        if (this.ouvertLundi()) res += " est ouvert le lundi";
        else res += " est fermé le lundi";
        if (this.ouvertDimanche()) res += " et ouvert le dimanche";
        else res += " et fermé le dimanche";
        return res;
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Magasin magasin = (Magasin) obj;
        return nom.equals(magasin.nom);
    }
}