import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;


public class EnsembleMieux<T> {
    private List<T> listeInterne;
    private int nbElements ;
    
    public EnsembleMieux() {
	// remplir listeInterne de 10000 cases à null
        listeInterne = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            listeInterne.add(null);
        }
        nbElements = 0;
    }
    
    public int size() {
        return this.nbElements;
    }
    
    public Iterator<T> iterator() {
        return listeInterne.iterator();	
    }

    @Override
    public boolean add(T elem) {
        if (elem != null) {
            int h = ((elem.hashCode() % 10000) + 10000) % 10000;
            if (listeInterne.get(h) == null) {
                listeInterne.set(h, elem);
                nbElements++;
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean contains(Object o) {
        if (o != null) {
            int h = ((elem.hashCode() % 10000) + 10000) % 10000;
            return Object.equals(listeInterne.get(h), o);
        }
        return false;
    }

    
}

