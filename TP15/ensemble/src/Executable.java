
import java.util.Set;
public class Executable{

    public static void main(String[] args) {
        System.out.println("Ensemble inefficace ");
        Set<Integer> e = new EnsembleInefficace<>();
        e.add(5); 
        e.add(-3); 
        e.add(3); 
        e.add(18); 
        e.add(3); 
        e.add(5); 
        System.out.println("Ensemble inefficace " + e);

        System.out.println("Ensemble Mieux ");
        Set<Integer> ens = new EnsembleMieux<>();
        ens.add(5);
        ens.add(-3); 
        ens.add(3); 
        ens.add(18); 
        ens.add(3); 
        ens.add(5); 
        System.out.println("Ensemble mieux " + ens);
        Set<Integer> ee = new EnsembleMieux<> ();
        ee.add(5);
        ee.add(5);
        ee.add(7);
        ee.add(null);
        ee.add(5);
        ee.add(7);
        ee.add(6);
        ee.remove(6);
        System.out.println("ensemble mieux avec un null" + ee);
        // [5, 7, ]
        System.out.println("boucle for itérateur ensemble mieux ");
        System.out.print("[");
        for (Integer val : ee) {
            System.out.print(val + " ");
        }
        System.out.println("]");
        // [5 7 ]
        
        System.out.println("Ensemble Mieux avec String ");
        Set<String> ensS = new EnsembleMieux<>();
        ensS.add("Bonjour");
        ensS.add("salut");
        ensS.add("Bonjous");
        ensS.add("roounjB");
        System.out.println("ici si on choisit une petite taille (10) " +  
                           "les chaines Bonjour et roounjB ont " + 
                           "le même hashCode modulo la taille le " + 
                           "dernier n'apparaît pas");
        for (String val : ensS) {
            System.out.println(val);
        }

        System.out.println("Ensemble fini avec List<List<T>>");
        Set<String> ensSS = new EnsembleFini<>();
        ensSS.add("Bonjour");
        ensSS.add("salut");
        ensSS.add("Bonjous");
        ensSS.add("roounjB");
        System.out.println("ici si on choisit une petite taille (10) " +  
                           "les chaines Bonjour et roounjB ont " + 
                           "le même hashCode modulo la taille le " + 
                           "dernier apparaît cette fois-ci");
        for (String val : ensSS) {
            System.out.println(val);
        }
    }
}
