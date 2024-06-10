import java.util.ArrayList;
import java.util.Arrays;

public class Exec {
    public static void main(String[] args) {
        List<Chaussette> lc = new ArrayList<>();
        lc.add(new Chaussette(6, "rouge", ""));
        lc.add(new Chaussette(7, "bleu", ""));
        lc.add(new Chaussette(8, "vert", ""));
        lc.add(new Chaussette(10, "rouge", ""));

        Chaussette c1 = new Chaussette(6, "rouge", "");
        Chaussette c2 = new Chaussette(5, "rose", "");

        BibChaussette bc = new BibChaussette(lc);

        System.out.println(estOrpheline(bc.getPlacard(), c1));
        System.out.println(estOrpheline(bc.getPlacard(), c2));


    }
}
