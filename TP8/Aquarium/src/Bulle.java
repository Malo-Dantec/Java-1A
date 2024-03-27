public class Bulle extends Mouvement {
    
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