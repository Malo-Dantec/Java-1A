public class GrosPoisson extends Poisson {

    @Override
    public void evolue() {
        this.posX += vitesseX;
    }
}