import java.util.ArrayList;
import java.util.List;

public class Texte {
    private List<Lettre> texte;

    public Texte(String chaine) {
        this.texte = new ArrayList<>();
        for (int i = 0; i < chaine.length() ; i++) {
            Lettre lettre = new Lettre(chaine.charAt(i));
            this.texte.add(lettre);
        }
    }

    public String toString() {
        String chaine = "";
        for (Lettre lettre : this.texte) {
            chaine += lettre.toChar();
        }
        return chaine;
    }

    public String toMorse() {
        String chaine_morse = "";
        for (Lettre lettre : this.texte) {
            String morse = lettre.toMorse();
            chaine_morse += morse + "___";
        }
        return chaine_morse.substring(0, chaine_morse.length()-3);
    }

    public boolean contient(Lettre lettre) {
        return this.texte.contains(lettre);
    }

    public String decode(String texteEnMorse) {
        String chaine = "";
        for (String lettre : texteEnMorse.split("___")) {
            Lettre t = new Lettre(lettre);
            chaine += t.toChar();
        }
        return chaine;
    }
    



}
