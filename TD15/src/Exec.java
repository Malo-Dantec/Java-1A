import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Exec{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // List<Integer> l = new ArrayList<>();
        // l.add(5);
        // l.add(4);
        // System.out.println(l);

        // Iterator<Integer> iterateur = l.iterator();
        // System.out.println(iterateur.hasNext());

        // while(iterateur.hasNext()) {
        //     System.out.println(iterateur.next());
        // }

        // int x = iterateur.next();
        // iterateur.remove();
        // x = iterateur.next();
        // iterateur.remove();

        // mystere(l);
        // afficheListe(l);

        List<Integer> list = Arrays.asList(3, 6, 3, 2, 1, -3, 2, 2, 2, 2);
        System.out.println(Iterateur.mystere0(list));

        System.out.println(Iterateur.mystere1(list, -4));

        IterateurMystere mystere = new IterateurMystere("Bonjour");
        while(mystere.hasNext()){
            System.out.print(mystere.next() + " ");
        }
        System.out.println();


        System.out.println(Iterateur.plusLongPlateau(list));


        Range range = new Range(1, 10, 2);
        for (int i : range) {
            System.out.print(i + " ");
        }
        System.out.println();


        // for(Integer i : new Range(10)){
        //     System.out.println(i);
        // }

    }
    public static <T extends Comparable<T>> T mystere(Collection<T> coll) {
        Iterator<T> iterateur = coll.iterator();
        T candidate = iterateur.next();
        while (iterateur.hasNext()) {
            T next = iterateur.next();
            if (next.compareTo(candidate) < 0) {
                candidate = next;
            }
        }
        return candidate;
    }


    public static <T> void afficheListe(Iterable<T> list) {
        Iterator<T> iterateur = list.iterator();
        while(iterateur.hasNext()) {
            System.out.print(iterateur.next() + " ");
        }
        System.out.println();
    }
}


    