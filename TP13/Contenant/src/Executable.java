import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Executable {
    public static void main(String[] args) {
        Couple c1 = new Couple(0, 1);
        Ensemble e1 = new Ensemble(new HashSet<>(Arrays.asList(0, 1, 2, 3, 4)));
        Couple c2 = new Couple(0, 2);

        List<Contenant<Integer>> contenants = Arrays.asList(c1, e1, c2);
        
        System.out.println(GestionContenants.<Integer>contientTous(contenants, 0));
        System.out.println(GestionContenants.<Integer>contientTous(contenants, 1));
    }
}
