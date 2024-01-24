public class ExecutablePersonnage{
    public static void main(String [] args){
        Personnage nain = new Personnage("Gimli", 65, 15);
        System.out.println(nain.getNom());
        System.out.println(nain.getTailleDesOreilles());
        System.out.println(nain.getBarbe());
    Personnage ex;
        ex = new Personnage("Malo", 100, 200);
        assert ex.getNom() == "Malo";
        assert ex.getBarbe() == 100;
        assert ex.getTailleDesOreilles() == 200;   
    }
}