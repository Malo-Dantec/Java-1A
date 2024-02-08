import java.util.ArrayList;
import java.util.List;
public class Cave {
    private List <Bouteille> cave;
    public Cave() {
        this.cave = new ArrayList<>();
    }

    public void ajouteBouteille(String region, String appellation, int millesime) {
        cave.add(new Bouteille(region, appellation, millesime));
    }

    public int nbBouteilles() {
        return cave.size();
    }

    public int nbBouteillesDeRegion(String reg) {
        int res = 0;
        for (Bouteille bouteille : this.cave) {
            if (bouteille.getRegion() == reg) res += 1;
        }
        return res;
    }

    public Bouteille plusVieilleBouteille() {
        Bouteille plusVieilleBouteille = null;
        int anneePlusAncienne = 0;
        for (Bouteille bouteille : this.cave) {
            if (anneePlusAncienne == 0) {
                anneePlusAncienne = bouteille.getMillesime();
                plusVieilleBouteille = bouteille;
            }
            else if (bouteille.getMillesime() < anneePlusAncienne) {
                anneePlusAncienne = bouteille.getMillesime();
                plusVieilleBouteille = bouteille;
            }
        }
        return plusVieilleBouteille;
    }

    public boolean contient(String region, String appellation, int millesime) {
        for (Bouteille bouteille : this.cave) {
            if (bouteille.getRegion() == region &&
                bouteille.getAppellation() == appellation && 
                bouteille.getMillesime() == millesime) {
                return true;
            }
        }
        return false;
    }


}
