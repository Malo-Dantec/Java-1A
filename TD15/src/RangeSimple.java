import java.util.Iterator;
import java.util.NoSuchElementException;
public class RangeSimple implements Iterable<Integer> {

    private int limite;


    public RangeSimple(int limite) {
        this.limite = limite;
    }

    public Iterator<Integer> iterator() {
        return new IterateurSimple(limite);
    }
}