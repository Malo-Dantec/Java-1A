public class Complexe {
    private double reel;
    private double imaginaire;

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public double getImaginaire() {
        return this.imaginaire;
    }

    public double getReel() {
        return this.reel;
    }

    public double getNorme() {
        return (int) this.getReel()^2 + (int) this.getImaginaire()^2;
    }

    @Override
    public String toString() {
        return "((" + this.reel + "," + this.imaginaire + "i) | " + this.getNorme() + ")";
    }
}