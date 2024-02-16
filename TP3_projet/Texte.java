import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Texte {
    private List<Lettre> texte;

    public Texte(String chaine) {
        this.texte = new ArrayList<>();
        for (int i = 0; i < chaine.length() ; i++) {
            this.texte.add(chaine.charAt(i));
        }
        // for (Lettre lettre : chaine) {
        //     this.texte.add(lettre);
        // }
    }

    public String toString() {

    }

    public String toMorse() {

    }




}
