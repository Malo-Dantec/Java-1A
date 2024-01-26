public class Champion {
    private String nom;
    private int pointsDeVie;
    private int attaque;
    private int soin;
    public Champion(String nom, int PV, int atq, int soin) {
        this.nom = nom;
        this.pointsDeVie = PV;
        this.attaque = atq;
        this.soin = soin;
    }
    public void combat(Champion adversaire) {
        this.pointsDeVie -= adversaire.attaque;
        adversaire.pointsDeVie -= this.attaque;
    }
    public void boitUnePotionDeSoin() {
        this.pointsDeVie += 5;
    }
    public void soigne(Champion blesseChampion) {
        blesseChampion.pointsDeVie += this.soin;
    }
    public boolean estEnVie() {
        return this.pointsDeVie > 0;
    }
    public String toString() {
        return this.nom + " ==> pv = " + this.pointsDeVie + " ; atq = " + this.attaque + " ; soin = " + this.soin;
    }
}