public class Case {
    private boolean contientUneBombe;
    private boolean estDecouverte;
    private boolean estMarquee;

    public Case() {

    }

    public void reset() {

    }

    public void poseBombe() {
        this.contientUneBombe = true;
    }

    public boolean contientUneBombe() {
        return this.contientUneBombe;
    }

    public boolean estDecouverte() {
        return this.estDecouverte;
    }

    public boolean estMarquee() {
        return this.estMarquee;
    }

    public boolean reveler() {
        this.estDecouverte = true;
        return true;
    }

    public void marquer() {
        this.estMarquee = true;
    }
}
