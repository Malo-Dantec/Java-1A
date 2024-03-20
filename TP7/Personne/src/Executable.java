import java.util.Arrays;
import java.util.List;

public class Executable {
    public static void main(String [] args) {

        


        Personne mohamed = new Personne("mohamed", 15);
        Personne mamath = new Personne("mamath", 90);
        Personne mamadou = new Personne("mamadou", 10);
        Personne rachid = new Personne("rachid", 12);

        List<Personne> liste = Arrays.asList(rachid, mamadou, mamath, mohamed);

        ListePersonnes listePersonnes = new ListePersonnes(liste);

        System.out.println(listePersonnes);
        listePersonnes.trier();
        System.out.println(listePersonnes);
        System.out.println(listePersonnes.ecartMin());
        
    }
}
