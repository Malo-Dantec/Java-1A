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
            "===_===_=_=", ".");

    private static List<Character> alphabet = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                                                            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                                                            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ');

    
    public Lettre(char lettre) {
        this.lettre = lettre;
    }

    public Lettre(String morse) {
        int res = Lettre.alphabetMorse.indexOf(morse);
        this.lettre = Lettre.alphabet.get(res);
    }
    
    public int toNumero() {
        return Lettre.alphabet.indexOf(this.lettre);
    }

    public char toChar() {
        return this.lettre;
    }

    public String toMorse() {
        int res = Lettre.alphabet.indexOf(this.lettre);
        return Lettre.alphabetMorse.get(res);
    }

    public String toString() {
        String morseString = Lettre.alphabetMorse.get(Lettre.alphabet.indexOf(this.lettre));
        return morseString;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Lettre other = (Lettre) obj;
        return lettre == other.lettre;
    }

}