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

    }

    public List<Sorcier> lesCourageux() {

    }

    public List<Sorcier> ElevestriesParCourage() {
        
    }


}
