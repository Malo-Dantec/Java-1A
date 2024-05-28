import java.util.Iterator;

public class Mystere implements Iterable<Character>{

    private String s;


    Mystere(String s){
        
    }

    
    public Iterator<Character> iterator(){
        return new IterateurMystere(s);
    }
    }