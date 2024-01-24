import java.lang.Math;
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
        return (float) Math.sqrt(this.premier * this.deuxieme * this.troisieme);
    }
    public void modifier(float nouvelle_val, int pos) {
        if (pos == 1) {
            this.premier = nouvelle_val;
        }
        if (pos == 2) {
            this.deuxieme = nouvelle_val;
        }
        if (pos == 3) {
            this.troisieme = nouvelle_val;
        }
    }
    public String toString() {
        return "Vecteur3f : < " + this.premier + " " + this.deuxieme + " " + this.troisieme + " > De norme : " + NormeV3F();
    }
}