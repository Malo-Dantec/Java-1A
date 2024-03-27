public class Mouvement {
    private double posX;
    private double posY;
    private double vitesse;

    public Mouvement(double x, double y, double v) {
        this.posX = x;
        this.posY = y;
        this.vitesse = v;
    }

    @Override
    public Dessin getDessin() {
        Dessin dessin = new Dessin();
        String couleur = "0x0000F0";
        dessin.ajouteChaine((int)this.posX, (int)this.posY, "°", couleur);
        return dessin;
    }


}
