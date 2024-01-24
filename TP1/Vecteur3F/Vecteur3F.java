public class Vecteur3F {
    private float premier;
    private float deuxieme;
    private float troisieme;
    public Vecteur3F(float p, float d, float t) {
        this.premier = p;
        this.deuxieme = d;
        this.troisieme = t;
    }
    public float NormeV3F() {
        return sqrt(this.premier * this.deuxieme * this.troisieme);
    }
    public modifier(float val, int pos) {

    }
}