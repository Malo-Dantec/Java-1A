import java.util.Arrays;
import java.util.List;

public class Executable {
    public static void main(String [] args) {

        Complexe c1 = new Complexe(2, 3);
        Complexe c2 = new Complexe(5, 3);
        Complexe c3 = new Complexe(6, 9);
        Complexe c4 = new Complexe(20, 30);
        Complexe c5 = new Complexe(1, 12);

        List<Complexe> liste = Arrays.asList(c1, c2, c3, c4, c5);

        ListeComplexes listeComplexes = new ListeComplexes(liste);

        System.out.println(listeComplexes);
        listeComplexes.trier();
        System.out.println(listeComplexes);

        System.out.println(listeComplexes.plusGrandeNorme());



    }
}
