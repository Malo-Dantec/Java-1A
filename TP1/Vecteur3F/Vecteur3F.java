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
        switch (pos) {
            case pos == 1 : 
                this.premier = val;
                break;
            case pos == 2 : 
                this.deuxieme = val;
                break;
            case pos == 3 :
                this.troisieme = val;
                break;
        }
        // if pos == 1 {
        //     this.premier = val;
        // }
        // if pos == 2 {
        //     this.deuxieme = val;
        // }
        // if pos == 3 {
        //     this.troisieme = val;
        // }
    }
    @Override
    public String toString() {
        return "Vecteur3f : < " + this.premier + " " + this.deuxieme + " " + this.troisieme + "> De norme : " + NormeV3F();
    }
}