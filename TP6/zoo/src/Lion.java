public class Lion extends Animal {
    private boolean crinière;
    public Lion(String nom, double poids, Enclos enclos, boolean crinière) {
        super(nom, poids, enclos);
        this.crinière = crinière;
    }
}