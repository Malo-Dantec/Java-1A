import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterateurMystere implements Iterator<Character> {

    String s;
    int position;


    IterateurMystere(String s){
        this.s = s;
        this.position = 0;
    }


    @Override
    public boolean hasNext(){
        return ((position + 2) <= s.length());
    }

    
    @Override
    public Character next() throws NoSuchElementException {
        if(!this.hasNext()){
            throw new NoSuchElementException();
        }
        int p = this.position;
        this.position += 2;
        return this.s.charAt(p);
    }
}