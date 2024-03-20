import java.util.Collections;
import java.util.List;

public class ListeComplexes {
    private List<Complexe> liste;

    public ListeComplexes(List<Complexe> liste) {
        this.liste = liste;
    }

    public void trier() {
        Collections.sort(this.liste, new Comparateur());
    }

    public Complexe plusGrandeNorme() {
        Complexe plusGrandeNorme = null;
        for(Complexe complexe : this.liste) {
            if(plusGrandeNorme == null) {plusGrandeNorme = complexe;}
            else if(plusGrandeNorme.getNorme() < complexe.getNorme()) {plusGrandeNorme = complexe;}
        }
        return plusGrandeNorme;
    }

    @Override
    public String toString() {
        return liste.toString();
    }
}
