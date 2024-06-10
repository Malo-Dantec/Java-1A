import java.util.ArrayList;
import java.util.Collections;

public class BibChaussette {
    private List<Chaussette> placard;

    public BibChaussette(List<Chaussette> lc) {
        placard = lc;
    }

    public boolean estOrpheline(List<Chaussette> lc, Chaussette c) {
        if (lc.contains(c)) {
            return false;
        }
        return true;
    }

    public List<Chaussette> trierParTaille() {
        List<Chaussette> lc = new ArrayList<>(placard);
        Collections.sort(lc);
        return lc;
    }

    public List<Chaussette> trierParCouleur() {
        List<Chaussette> lc = new ArrayList<>(placard);
        Collections.sort(lc, new ComparerCouleur());
        return lc;
    }

    public List<Chaussette> getPlacard() {
        return placard;
    }
    
}
