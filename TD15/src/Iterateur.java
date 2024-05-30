import java.util.Iterator;
import java.util.List;

public class Iterateur {

    private Iterateur() {}

    public static int mystere0(Iterable<Integer> coll) {
        Iterator<Integer> iterateur = coll.iterator();
        int res = 0;
        while (iterateur.hasNext()) {
            res += 1;
            iterateur.next();
        }
        return res;
    }

    public static <T> boolean mystere1(Iterable<T> coll, T elem){
        Iterator<T> iterateur = coll.iterator();
        while (iterateur.hasNext()) {
            if(iterateur.next().equals(elem)){
                return true;
            }
        }
        return false;
    }

    public static int plusLongPlateau(List<Integer> liste) {
        if (liste == null || liste.isEmpty()) {
            return 0;
        }
        Iterator<Integer> iterateur = liste.iterator();
        int maxPlateau = 1;
        int indActu = 1;
        int prec = iterateur.next();

        while (iterateur.hasNext()) {
            int suivant = iterateur.next();
            if (suivant == prec) {
                indActu++;
            } else {
                if (indActu > maxPlateau) {
                    maxPlateau = indActu;
                }
                indActu = 1;
            }
            prec = suivant;
        }
        if (indActu > maxPlateau) {
            maxPlateau = indActu;
        }

        return maxPlateau;
    }
}