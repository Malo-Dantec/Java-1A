import java.util.Arrays;
import java.util.List;

public class Lettre{
    private char lettre;
    private static List<String> alphabetMorse = Arrays.asList("=_===", 
            "===_=_=_=", "===_===_=", "===_=_=", "=", "=_=_===_=",
            "===_===_=", "=_=_=_=", "=_=", "=_===_===_===", "===_=_===",
            "=_===_=_=", "===_===", "===_=", "===_===_===", "=_===_===_=",
            "===_===_=_===", "=_===_=", "=_=_=", "===", "=_=_===",
            "=_=_=_===", "=_===_===", "===_=_=_===", "===_=_===_===",
            "===_===_=_=", "_");
    
    public Lettre(char lettre) {
        this.lettre = lettre;
    }

    public Lettre(String morse) {
        String lettre = Lettre.alphabetMorse.get(this.toNumero());
    }
    
    public int toNumero() {
        if ((int) this.lettre -65 >= 0) {
            return (int) this.lettre - 65;
        }
        else {
            return 26;
        }
    }

    public char toChar() {
        return this.lettre;
    }

    public String toMorse() {
        return "=_==";
    }

    public String toString() {
        return "lettre";
    }
}