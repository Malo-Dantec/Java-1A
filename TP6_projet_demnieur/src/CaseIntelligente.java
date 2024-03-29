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
        int res = 0;
        for (Case cases : this.LesVoisines) {
            if (cases.contientUneBombe()) {res += 1;}
        }
        return res;
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