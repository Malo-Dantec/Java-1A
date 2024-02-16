import java.util.ArrayList;
import java.util.List;
public class Ecole {
    private String nom;
    private List<Maison> LesMaisons;

    public Ecole(String nom) {
        this.nom = nom;
        LesMaisons = new ArrayList<>();
    }

    public void ajouter(Maison maison) {
        LesMaisons.add(maison);
    }

    public Maison plusGrandeMaison() {
        Maison maison = null;
        for (Maison mson : this.LesMaisons) {
            if (maison == null) {
                maison = mson;
            }
            else if (maison.nombreEleve() < mson.nombreEleve()) {
                maison = mson;
            }
        }
        return maison;
    }

    public List<Sorcier> lesCourageux() {
        List<Sorcier> LesCourageux = new ArrayList<>();
        for (Maison maison : this.LesMaisons) {
            for (Sorcier sorcier : maison.getLesSorciers()) {
                if (sorcier.estCourageux()) {
                    LesCourageux.add(sorcier);
                }
            }
        }
        return LesCourageux;
    }

    public List<Sorcier> ElevesTriesParCourage() {
        List<Sorcier> LesSorciers = new ArrayList<>();
        List<Sorcier> SorciersParCourage = new ArrayList<>();
        return SorciersParCourage;
    }


}
