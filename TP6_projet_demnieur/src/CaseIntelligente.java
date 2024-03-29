import java.util.ArrayList;
import java.util.List;

public class CaseIntelligente extends Case {

    private List<Case> LesVoisines;

    public CaseIntelligente() {
        super();
        this.LesVoisines = new ArrayList<>();
    }

    public void ajouteVoisine(Case c) {
        if (c != null) {
            this.LesVoisines.add(c);
        }
    }

    public int nombreBombesVoisines() {
        if(this.LesVoisines.isEmpty()) {return 0;}
        int cptBombes = 0;
        for(Case c : this.LesVoisines) {
            if(c.contientUneBombe()) {cptBombes += 1;}
        }
        return cptBombes;
    }

    public String toString() {
        if (this.estMarquee()) {return "?";}
        else if (this.estDecouverte()) {
            if (this.contientUneBombe()) {return "@";}
            else {return "" + this.nombreBombesVoisines();}
        }
        else {return " ";}
    }


}