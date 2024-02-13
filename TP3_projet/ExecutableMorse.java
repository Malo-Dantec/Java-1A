public class ExecutableMorse {
     public static void main ( String [] args ) {
     Lettre n = new Lettre('N');
     assert n.toChar() == 'N';
     assert n.toMorse().equals("===_=");
     Lettre a = new Lettre("=_===");
     assert a.toMorse().equals("=_===");
     assert a.toChar() == 'A';
     System.out.println(n.toNumero());
    char caractere = 'T';
    int codeASCII = ( int ) caractere ;
    System . out . println ( codeASCII ) ;
    char carac = (char) codeASCII;
    System.out.println(carac);
    System.out.println((char) 65);
    Lettre espace = new Lettre(' ');
    System.out.println(espace.toNumero());
    }
}
