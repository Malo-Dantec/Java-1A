public class Chaussette implements Comparable<Chaussette>{

    private int taille;
    private String couleur;
    private String composition;


    public Chaussette(int taille, String couleur, String composition) {
        this.taille = taille;
        this.couleur = couleur;
        this.composition = composition;
    }

    public int getTaille() {
        return this.taille;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public String getComposition() {
        return this.composition;
    }

    public void laver(int temperature) {
        if (temperature > 30) {
            this.taille *= 0.9;
        }
    }

    @Override
    public int compareTo(Chaussette c) {
        return this.getTaille() - c.getTaille();
    }

}