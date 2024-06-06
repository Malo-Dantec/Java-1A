import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EnsembleInefficace<T> extends AbstractSet<T> {

    private Set<T> setT;
    private List<T> listT;

    public EnsembleInefficace() {
        listT = new ArrayList<>();
        setT = new HashSet<>();
    }

    @Override
    public int size() {
        return listT.size();
    }

    @Override
    public Iterator<T> iterator() {
        return setT.iterator();
    }

    @Override
    public boolean add(T elem) {
        int res = setT.size();
        listT.add(elem);
        setT = new HashSet<>(listT);
        return res < setT.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {return false;}
        if (o == this) {return true;}
        if (o instanceof EnsembleInefficace) {
            EnsembleInefficace<?> ens = (EnsembleInefficace<?>) o;
            return ens.listT.equals(this.listT);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return listT.hashCode() * 31;
    }


}
