public class PetitPoisson extends Poisson {

    @Override
    public void evolue() {
        this.posX += vitesseX;
    }
}