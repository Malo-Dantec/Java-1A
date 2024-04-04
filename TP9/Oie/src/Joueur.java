import java.util.Random;

public class Joueur {
    private Case saCase;
    private String nom;

    public Joueur(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        return this.nom;
    }

    public Case getCase() {
        return this.saCase;
    }


    public void caseCourante(Case c) {
        this.saCase = c;
    }


    private int unJeteDeDes() {	
        return 1;
    }
    public int secondJeteDeDes() {
        return 1;
    }
}
