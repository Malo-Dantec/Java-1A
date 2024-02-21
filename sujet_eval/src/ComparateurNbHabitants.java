import java.util.Comparator;

public class ComparateurNbHabitants implements Comparator<Ville> {


    public int compare(Ville v1, Ville v2) {
        if (v1.getNbHabitants() > v2.getNbHabitants()) {
            return 1;
        }
        else if (v2.getNbHabitants() > v1.getNbHabitants()) {
            return -1;
        }
        else {return 0;}
    }
}