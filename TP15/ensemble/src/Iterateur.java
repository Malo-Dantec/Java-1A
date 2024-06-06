import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Iterateur<T> implements Iterator<T> {
	private List<T> valeurs;
	private int position;
	private int lastPosition;

        
    public Iterateur(List<T> array) {
        valeurs = array;
        position = 0;
        while(position < valeurs.size() && valeurs.get(position) == null) {
            position++;
        }
        lastPosition -= 1;
    }

    @Override
    public T next() throws NoSuchElementException {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        lastPosition = position;
        T valeur = valeurs.get(position++);
        while (position < valeurs.size() && valeurs.get(position) == null) {
            position++;
        }
        return valeur;
    }

    @Override
    public boolean hasNext() {
        return position < valeurs.size();
    }
	
    @Override
    public void remove() {
        valeurs.remove(lastPosition);
    }
}	    
