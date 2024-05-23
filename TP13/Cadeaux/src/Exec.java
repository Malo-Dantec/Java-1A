import java.util.Arrays;

public class Exec {
    public static void main(String[] args) {
        List<Cadeau> sac = new Arrays.asList(new Diamant(7),
                                            new BouquetDeFleurs(1, 3),
                                            new Argent(5));
        System.out.println(sac);
        // [Diamant de 7g, Bouquet de 1 Dalhia(s) et de 3 Rose(s), 5 pièces de 5g chacune]
    }
}
