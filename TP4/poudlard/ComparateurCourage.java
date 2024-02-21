import java.util.Comparator;

public class ComparateurCourage implements Comparator<Sorcier> {


    public int compare(Sorcier s1, Sorcier s2) {
        if (s1.getCourage() > s2.getCourage()) {
            return 1;
        }
        else if (s2.getCourage() > s1.getCourage()) {
            return -1;
        }
        else {return 0;}
    }
}
