import java.util.ArrayList;
import java.util.List;
public class Maison {
    private String nom;
    private List<Sorcier> LesSorciers;

    public Maison(String nom) {
        this.nom = nom;
        LesSorciers = new ArrayList<>();
    }

    public boolean ajouter(String nomSorcier, int courage, int sagesse) {
        if (LesSorciers.contains(new Sorcier(nomSorcier, courage, sagesse))) {
            return false;
        }
        else {
            LesSorciers.add(new Sorcier(nomSorcier, courage, sagesse));
            return true;
        }
    }

    public int nombreEleve() {
        return LesSorciers.size();
    }

    public boolean contientCourageux() {
        for (Sorcier sorcier: this.LesSorciers) {
            if (sorcier.estCourageux() == true) {return true;}
        }
        return false;
    }

    public Sorcier leMoinsCourageux() {
        Sorcier leMoinsCourageux = null;
        for (Sorcier sorcier : this.LesSorciers) {
            if (leMoinsCourageux != null && sorcier.getCourage() < leMoinsCourageux.getCourage()) {
                leMoinsCourageux = sorcier;
            }
            else if (leMoinsCourageux == null) {
                leMoinsCourageux = sorcier;
            }
        }
        return leMoinsCourageux;
    }

    public Sorcier lePlusSage() {
        Sorcier lePlusSage = null;
        for (Sorcier sorcier : this.LesSorciers) {
            if (lePlusSage != null && sorcier.getSagesse() > lePlusSage.getSagesse()) {
                lePlusSage = sorcier;
            }
            else if (lePlusSage == null) {
                lePlusSage = sorcier;
            }
        }
        return lePlusSage;
    }

    public void trierParCourage() {

    }





}
