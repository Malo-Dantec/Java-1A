import java.util.ArrayList;
import java.util.List;
public class Festival {
    private String nom;
    private List<Concert> LesConcerts;

    public Festival(String nom) {
        this.nom = nom;
        this.LesConcerts = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }


    public void ajouterConcert(String concert, String groupe) {
        LesConcerts.add(new Concert(concert, groupe));
    }

    public void ajouterConcert(Concert concert) {
        LesConcerts.add(concert);
    }

    public void reserver(Spectateur spectateur, Concert concert, int prix) {
        new Billet(spectateur, concert, prix);
    }

    public int nombreConcert() {
        return LesConcerts.size();
    }

    public int nombreBilletConcert(Concert concert) {
        return 0;
    }




}
