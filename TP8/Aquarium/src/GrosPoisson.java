public class GrosPoisson{
    private double posX;
    private double posY;
    private double vitesseX;


    public GrosPoisson(double x, double y, double v) {
        this.posX = x;
        this.posY = y;
        this.vitesseX = v;
    }

    public void evolue() {
        this.posX += vitesseX;
    }
}