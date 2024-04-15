import java.util.Collections;
import java.util.NoSuchElementException;

public class Executable {
    public static void main(String[] args) throws Exception {
            ListeEntiers liste1 = new ListeEntiers();
            liste1.remplir();

            ListeEntiers liste2 = new ListeEntiers();

            System.out.println("liste : " + liste1);
        try {
            int min1 = Collections.min(liste1);
            System.out.println("min : " + min1);
        }
        catch (NoSuchElementException e) {
            System.out.println("La liste est vide ! " + e);
        }
        try {
            int max1 = liste1.getMax();
            System.out.println("max : " + max1);
        }
        catch (NoSuchElementException e) {
            System.out.println("La liste est vide ! " + e);
        }
        int ind = 3;
        try {
            int get = liste1.get(ind);
            System.out.println(get);
        }
        catch (NoSuchElementException e) {
            System.out.println("La liste est plus petite que l'indice " + ind + " ! " + e);
        }
        try {
            System.out.println(Collections.min(liste2));
            System.out.println(liste2.getMax());
        }

        catch (NoSuchElementException e) { 
            System.out.println("La liste est vide ! " + e); 
        } 
    }
}
