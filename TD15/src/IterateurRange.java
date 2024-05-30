import java.util.Iterator;
import java.util.NoSuchElementException;
public class IterateurSimple implements Iterator<Integer> {

    private int pos;
    private int fin;
    private int step;


    public IterateurRange(int deb, int fin, int step) {
        this.pos = deb;
        this.fin = fin;
        this.step = step;
    }
    
    @Override
    public Integer next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return pos+step;
    }

    @Override
    public boolean hasNext() {
        return pos < fin;
    }
}