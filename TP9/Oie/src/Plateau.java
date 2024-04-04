import java.util.List;
import java.util.ArrayList;

public class Plateau {
    private List<Case> cases;

    public Plateau(){
        this.cases = new ArrayList<>();
        initPlateau();
    }
    
    /** initialise le plateau en créant les cases */
    private void initPlateau(){
        for(int i = 0 ; i < 64 ; i++) {
            this.cases.add(new CaseBase(i));
        }


        this.cases.set(9, new CaseOie());
        this.cases.set(18, new CaseOie());
        this.cases.set(27, new CaseOie());
        this.cases.set(36, new CaseOie());
        this.cases.set(45, new CaseOie());
        this.cases.set(54, new CaseOie());

        this.cases.set(31);
        this.cases.set(52);

        this.cases.set(19);

        this.cases.set(6);

    }
 
    public Case getCase(int numero) {
		    return this.cases.get(numero);
    }
    
}
