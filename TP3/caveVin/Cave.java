import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;
public class Cave {
    private String nom;
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

    public String plusVieilleBouteille() {
        
    }

    public boolean contient(String region, String appellation, int millesime) {

    }


}
