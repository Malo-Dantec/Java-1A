import java.util.Iterator;
import java.util.NoSuchElementException;
public class Range implements Iterable<Integer> {

    private int limite;
    private int deb;
    private int step;


    public Range(int deb, int limite, int step) {
        this.limite = limite;
        this.deb = deb;
        this.step = step;
    }

    public Iterator<Integer> iterator() {
        return new IterateurRange(deb, limite, step);
    }
}