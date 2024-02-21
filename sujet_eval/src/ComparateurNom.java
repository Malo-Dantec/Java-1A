import java.util.Comparator;

public class ComparateurNom implements Comparator<Ville> {


    public int compare(Ville n1, Ville n2) {
        if (n1.getNbHabitants() > n2.getNbHabitants()) {
            return 1;
        }
        else if (n2.getNbHabitants() > n1.getNbHabitants()) {
            return -1;
        }
        else {return 0;}
    }
}