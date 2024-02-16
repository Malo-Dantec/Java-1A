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
            chaine += lettre;
        }
        return chaine;
    }

    public String toMorse() {
        String chaine_morse = "";
        for (Lettre lettre : this.texte) {
            String morse = lettre.toMorse();
            chaine_morse += "___" + morse;
        }
        return chaine_morse;
    }




}
