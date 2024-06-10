import java.util.ArrayList;

public class Pile extends ArrayList {

    public Pile() {
        super();
    }

    public void empiler(T elem) {
        super.add(0, elem);
    }

    public void depiler() throws PileVideException {
        if (super.isEmpty()) {
            throw new PileVideException();
        }
        super.remove(0);
    }

    public T sommet() throws PileVideException {
        if (super.isEmpty()) {
            throw new PileVideException();
        }
        return super.get(0);
    }

    
}
