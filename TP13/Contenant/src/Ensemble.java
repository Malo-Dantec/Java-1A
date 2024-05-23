import java.util.HashSet;
import java.util.Set;

public class Ensemble implements Contenant<Integer> {
    private Set<Integer> ensemble;

    public Ensemble(Set<Integer> ens) {
        this.ensemble = new HashSet<>(ens);
    }

    @Override
    public boolean contient(Integer x) {
        return this.ensemble.contains(x);
    }
}
