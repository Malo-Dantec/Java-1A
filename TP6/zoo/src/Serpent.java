public class Serpent extends Animal {
    private boolean venimeux;
    public Serpent(String nom, double poids, Enclos enclos, boolean venimeux) {
        super(nom, poids, enclos);
        this.venimeux = venimeux;
    }
}