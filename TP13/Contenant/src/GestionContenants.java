import java.util.List;

public class GestionContenants {
    private GestionContenants(){}
    
    public static <T> boolean contientTous(List<Contenant<T>> conts, T elem) {
        for (Contenant<T> contenant : conts) {
            if (!contenant.contient(elem)) {return false;}
        }
        return true;
    }
}
