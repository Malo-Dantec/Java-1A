import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau {
    private int nbLignes;
    private int nbColonnes;
    private int pourcentageDeBombes;
    private int nbBombes;
    private List<List<CaseIntelligente>> LePlateau;

    public Plateau(int nbLignes, int nbColonnes, int pourcentage) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentage;
        this.nbBombes = 0;
        this.LePlateau = new ArrayList<>();
        for (int i = 0; i < nbLignes; i++) {
            List<CaseIntelligente> ligne = new ArrayList<>();
            for (int j = 0; j < nbColonnes; j++) {
                ligne.add(new CaseIntelligente());
            }
            this.LePlateau.add(ligne);
        }
        this.rendLesCasesIntelligentes();
        this.poseDesBombesAleatoirement();
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
        if (numLigne >= 0 && numLigne < this.getNbLignes() && numColonne >= 0 && numColonne < this.getNbColonnes()) {
            return this.LePlateau.get(numLigne).get(numColonne);
        }
        return null;
    }

    public int getNbCasesMarquees() {
        int res = 0;
        for (List<CaseIntelligente> ligne : this.LePlateau) {
            for (CaseIntelligente cases : ligne) {
                if (cases.estMarquee()) {
                    res++;
                }
            }
        }
        return res;
    }

    public void poseBombe(int x, int y) {
        Case cases = this.LePlateau.get(x).get(y);
        cases.poseBombe();
    }

    public void reset() {
        for (List<CaseIntelligente> ligne : this.LePlateau) {
            for (CaseIntelligente cases : ligne) {
                cases.reset();
            }
        }
        this.nbBombes = 0;
    }




}