import java.util.List;

public class CaseIntelligente extends Case {

    private List<Case> LesVoisines;

    public CaseIntelligente() {

    }

    public void ajouteVoisine(Case uneCase) {

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