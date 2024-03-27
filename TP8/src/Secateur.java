public class Secateur extends Coupe{

    public Secateur(String marque) { 
        super(marque);
    }

    public void utiliser() {
        System.out.print ( "mon sécateur ");
        super.utiliser();
    }
}