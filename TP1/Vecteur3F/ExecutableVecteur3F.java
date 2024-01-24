public class ExecutableVecteur3F {
    public static void main(String [] args) {
        Vecteur3F v3f = new Vecteur3F(4.5f, 7.325f, 6.875f); // Ne marche pas avec un nombre négatif.
        System.out.println(v3f.toString());
        Vecteur3F v3ff = v3f;
        v3ff.modifier(5.55f, 1);
        System.out.println(v3ff.toString());
        System.out.println(v3f);
    }
}