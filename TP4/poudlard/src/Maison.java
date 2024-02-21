import java.util.ArrayList;
import java.util.Collections;

public class Maison {

    private String nom;
    private ArrayList<Sorcier> eleves;

    public Maison(String nom) {
        this.nom = nom;
        this.eleves = new ArrayList<Sorcier>();
    }

    public void ajouter(String nom, int courage, int sagesse) {
        Sorcier s = new Sorcier(nom, courage, sagesse);
        if (!this.eleves.contains(s)) {
            this.eleves.add(s);
        }
    }

    public String getNom() {
        return this.nom;
    }

    public int nombreEleve() {
        return this.eleves.size();
    }

    public ArrayList<Sorcier> getEleves() {
        return this.eleves;
    }

    public boolean contientCourageux() {
        for (Sorcier eleve : this.eleves) {
            if (eleve.estCourageux()) {
                return true;
            }
        }
        return false;
    }

    public Sorcier leMoinsCourageux() {
        Sorcier moinsCourageux = this.eleves.get(0);
        for (Sorcier eleve : this.eleves) {
            if (eleve.getCourage() < moinsCourageux.getCourage()) {
                moinsCourageux = eleve;
            }
        }
        return moinsCourageux;
    }

    public Sorcier lePlusSage() {
        Sorcier plusSage = this.eleves.get(0);
        for (Sorcier eleve : this.eleves) {
            if (eleve.getSagesse() > plusSage.getSagesse()) {
                plusSage = eleve;
            }
        }
        return plusSage;
    }

    public void trierParCourage() {
        Collections.sort(this.eleves, new ComparateurCourage());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Maison) {
            Maison maison = (Maison) obj;
            return this.getNom().equals(maison.getNom());
        }
        return false;
    }



}