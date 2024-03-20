import java.util.Comparator;

public class Comparateur implements Comparator<Complexe>{

    @Override

    // Trier par réel croissant.
    //
    // public int compare(Complexe c1, Complexe c2) {
    //     return (int) c1.getReel() - (int) c2.getReel();
    // }


    // Trier par norme croissante
    //
    // public int compare(Complexe c1, Complexe c2) {
    //     return (int) c1.getNorme() - (int) c2.getNorme();
    // }


    // Trier par norme décroissante
    //
    public int compare(Complexe c1, Complexe c2) {
        return (int) c2.getNorme() - (int) c1.getNorme();
    }


}
