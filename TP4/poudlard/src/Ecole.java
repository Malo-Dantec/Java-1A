import java.util.ArrayList;
import java.util.List;

public class Ecole {

    private String nom;
    private ArrayList<Maison> maisons;

    public Ecole(String nom) {
        this.nom = nom;
        this.maisons = new ArrayList<Maison>();
    }

    public String getNom() {
        return this.nom;
    }

    public ArrayList<Maison> getMaisons() {
        return this.maisons;
    }
    public void ajouter(Maison maison) {
        if (!this.maisons.contains(maison)) {
            this.maisons.add(maison);
        }
        
    }

    public Maison plusGrandeMaison() {
        Maison plusGrandeMaison = this.maisons.get(0);
        for (Maison maison : this.maisons) {
            if (maison.nombreEleve() > plusGrandeMaison.nombreEleve()) {
                plusGrandeMaison = maison;
            }
        }
        return plusGrandeMaison;
    }

    public List<Sorcier> lesCourageux() {
        List<Sorcier> courageux = new ArrayList<Sorcier>();
        for (Maison maison : this.maisons) {
            for (Sorcier eleve : maison.getEleves()) {
                if (eleve.estCourageux()) {
                    courageux.add(eleve);
                }
            }
        }
        return courageux;
    }
    
}