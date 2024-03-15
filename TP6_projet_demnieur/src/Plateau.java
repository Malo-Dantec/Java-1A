import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau {
    private int nbLignes;
    private int nbColonnes;
    private int pourcentageDeBombes;
    private int nbBombes;
    private List<CaseIntelligente> LesCasesIntelligentes;
    private List<Case> LesCases;

    public Plateau(int nbLignes, int nbColonnes, int pourcentage) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentage;
        this.LesCases = new ArrayList<>();
        for (int i = 0 ; i < this.nbLignes * this.nbColonnes ; i++) {
            this.LesCases.add(new Case());
        }

    }

    private void creerLesCasesVides() {

    }

    private void rendLesCasesIntelligentes() {

    }

    protected void poseDesBombesAleatoirement(){
        Random generateur = new Random();
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if (generateur.nextInt(100)+1 < this.pourcentageDeBombes){
                    this.poseBombe(x, y);
                    this.nbBombes = this.nbBombes + 1;
                }
            }
        }
    }

    public int getNbLignes() {
        return this.nbLignes;
    }

    public int getNbColonnes() {
        return this.nbColonnes;
    }

    public int getNbTotalBombes() {
        return this.getNbColonnes() * this.getNbLignes() * this.pourcentageDeBombes/100;
    }

    public CaseIntelligente getCase(int numLigne, int numColonne) {

    }

    public int getNbCasesMarquees() {
        int res = 0;
        for (Case cases : this.LesCases) {
            if (cases.estMarquee() == true) {
                res += 1;
            }
        }
        return res;
    }

    public void poseBombe(int x, int y) {
        Case cases = this.LesCases.get(x*y);
        cases.poseBombe();
    }

    public void reset() {

    }




}