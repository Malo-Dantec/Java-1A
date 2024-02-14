import java.util.ArrayList;
import java.util.List;
public class Festival {
    private String nom;
    private List<Concert> LesConcerts;
    private List<Billet> LesBillets;

    public Festival(String nom) {
        this.nom = nom;
        this.LesConcerts = new ArrayList<>();
        this.LesBillets = new ArrayList<>();
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
        LesBillets.add(new Billet(spectateur, concert, prix));
    }

    public int nombreConcert() {
        return LesConcerts.size();
    }

    public int nombreBilletConcert(Concert concert) {
        int res = 0;
        for (Billet billet : this.LesBillets) {
            if (billet.getConcert().equals(concert)) {
                res += 1;
            }
        }
        return res;
    }




}
