public class Ciseau extends Coupe {

    public Ciseau(String marque) { 
        super(marque);
    }

    public void utiliser () {
        System.out.print("mes ciseaux ");
        super.utiliser();
    }
}