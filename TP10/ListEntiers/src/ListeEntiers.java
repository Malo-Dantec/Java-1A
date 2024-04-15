import java.util.List;
import java.util.NoSuchElementException;
import java.util. ArrayList ;
import java.util.Collections;
import java.lang.Math;
import java.util.Random;

public class ListeEntiers extends ArrayList<Integer>{

    public static Random rand = new Random();

    public ListeEntiers () {
        super();
    }

    /** remplissage liste */
    public void remplir () {
        int nb = rand.nextInt(10) + 1;
        for ( int i = 0; i < nb ; ++i) {
            this.add(rand.nextInt(50) + 1);
        }
    }

    /** getter */
    public List<Integer> getEntiers () {
        return this;
    }
    @Override
    public Integer get(int ind) throws NoSuchElementException{
        if (ind < 0 || ind >= this.size()) {
            throw new NoSuchElementException();
        }
        return super.get(ind);
    }

    public int getMax() throws Exception{
        try {
            return Collections.max(this);
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        }
        
        // OU
        // if (this.isEmpty()) {throw new NoSuchElementException();}
        // return Collections.max(this);
    }

    @Override
    public String toString () {
        return super.toString();
    }
}