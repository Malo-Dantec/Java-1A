public class Billet {
    private int prix;
    private Concert concert;
    private Spectateur spectateur;


    public Billet(Spectateur spectateur, Concert concert, int prix) {
        this.spectateur = spectateur;
        this.concert = concert;
        this.prix = prix;
    }

    public Concert getConcert() {
        return this.concert;
    }

    public Spectateur getSpectateur() {
        return this.spectateur;
    }

    public int getPrix() {
        return this.prix;
    }
}
