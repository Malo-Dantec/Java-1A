import java.util.ArrayList;
import java.util.List;
public class Ville {
    private String nom ;
    private List < Magasin > magasins ;
    public Ville ( String nom ) {
        this.nom = nom;
        this.magasins = new ArrayList<>();
    }
    public void ajouteMagasin ( String nom , boolean lundi , boolean dimanche ) {
        magasins.add(new Magasin(nom, lundi, dimanche));
    }
    public List < Magasin > ouvertsLeLundi() {
        List<Magasin> res = new ArrayList<>();
        for (Magasin mag : this.magasins) {
            if (mag.ouvertLundi())
                res.add(mag);
        }
        return res;
    }
    public List < Magasin > ouvertsLeDimanche() {
        List<Magasin> res = new ArrayList<>();
        for (Magasin mag : this.magasins) {
            if (mag.ouvertDimanche())
                res.add(mag);
        }
        return res;
    }
    public String getNomVille() {
        return this.nom;
    }
    @Override
    public String toString () {
        return ouvertsLeLundi() + ".";
    }
}