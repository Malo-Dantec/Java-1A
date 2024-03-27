public class Bulle{
    private double posX;
    private double posY;
    private double vitesse;

    public Bulle(double x, double y, double v) {
        this.posX = x;
        this.posY = y;
        this.vitesse = v;
    }

    public Dessin getDessin() {
        Dessin dessin = new Dessin();
        String couleur = "0x0000F0";
        dessin.ajouteChaine((int)this.posX, (int)this.posY, "°", couleur);
        return dessin;
    }

    public void evolue() {
        this.posY += 1;
    }
}