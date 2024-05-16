import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Ville {
    private String nom ;
    private Set < Magasin > magasins ;
    public Ville ( String nom ) {
        this.nom = nom;
        this.magasins = new HashSet<>();
    }
    public void ajouteMagasin ( String nom , boolean lundi , boolean dimanche ) {
        magasins.add(new Magasin(nom, lundi, dimanche));
    }
    public Set < Magasin > ouvertsLeLundi() {
        Set<Magasin> res = new HashSet<>();
        for (Magasin mag : this.magasins) {
            if (mag.ouvertLundi())
                res.add(mag);
        }
        return res;
    }
    public Set < Magasin > ouvertsLeDimanche() {
        Set<Magasin> res = new HashSet<>();
        for (Magasin mag : this.magasins) {
            if (mag.ouvertDimanche())
                res.add(mag);
        }
        return res;
    }
    public String getNomVille() {
        return this.nom;
    }

    public void afficheMagasins() {
        System.out.println("Ensemble des magasins de la ville"+ this.nom +" :");
        for(Magasin mag : this.magasins) {
            System.out.println(mag);
        }
    }
    @Override
    public String toString () {
        return ouvertsLeLundi() + ".";
    }
}