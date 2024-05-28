import java.util.Iterator;

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
}