public class ExecutableMorse {
    public static void main ( String [] args ) {
    Lettre n = new Lettre('N');
    Lettre l = new Lettre('L');
    Lettre y = new Lettre('Y');
    Lettre a = new Lettre("=_===");
    Lettre espace = new Lettre(' ');


    Texte t1 = new Texte("MALO D");
    Texte esp = new Texte("T T");
    Texte texte = new Texte("DANTEC M");


    assert n.toChar() == 'N';
    assert n.toMorse().equals("===_=");
    assert a.toMorse().equals("=_===");
    assert a.toChar() == 'A';

    System.out.println(n.toNumero());
    char caractere = 'T';
    int codeASCII = ( int ) caractere ;
    System . out . println ( codeASCII ) ;
    char carac = (char) codeASCII;
    System.out.println(carac);
    System.out.println((char) 65);
    System.out.println(espace.toNumero());



    System.out.println(t1.toString());
    System.out.println(t1.toMorse());
    System.out.println(t1.contient(l));
    System.out.println(t1.contient(y));
    
    System.out.println(texte.toMorse());
    System.out.println(texte.decode(texte.toMorse()));

    System.out.println(espace);
    System.out.println(espace.toMorse());
    
    System.out.println(esp.toMorse());
    System.out.println(esp.decode(esp.toMorse()));
    System.out.println(esp.contient(espace));
    }
}
