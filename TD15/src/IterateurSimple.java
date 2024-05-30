import java.util.Iterator;
import java.util.NoSuchElementException;
public class IterateurSimple implements Iterator<Integer> {

    private int pos;
    private int fin;


    public IterateurSimple(int fin) {
        this.pos = 0;
        this.fin = fin;
    }
    
    @Override
    public Integer next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return pos++;
    }

    @Override
    public boolean hasNext() {
        return pos < fin;
    }
}