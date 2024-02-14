import java.util.ArrayList;
import java.util.List;
public class Pluviometrie {
    private int annee;
    private int semaine;
    private List < Integer > precipitations;
    
    public Pluviometrie(int annee, int semaine) {
        this.annee = annee;
        this.semaine = semaine;
        this.precipitations = new ArrayList<>(7);
        for (int i = 0; i<7;i++) {
            this.precipitations.add(null);
        }
    }

    public void setPrecipitation(int jour, int pluie) {
        precipitations.set(jour, pluie);
    }

    public Integer getPluie(int jour) {
        return precipitations.get(jour);
    }

    public int quantiteTotale() {
        int res = 0;
        for (Integer i : this.precipitations) {
            if (i != null) {
                res += i;
            }
        }
        return res;
    }

    public int quantiteMax() {
        int res = 0;
        for (Integer i : this.precipitations) {
            if (i != null && i > res) {
                res = i;
            }
        }
        return res;
    }

    public boolean estPluvieuse() {
        for (Integer i : this.precipitations) {
            if (i != null && i > 0 && i-1 > 0) {
                return true;
            }
        }
        return false;
    }
}
