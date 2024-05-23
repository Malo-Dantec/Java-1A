public class Couple implements Contenant<Integer> {
    private Integer premier;
    private Integer second;

    public Couple(Integer p, Integer s) {
        this.premier = p;
        this.second = s;
    }

    @Override
    public boolean contient(Integer x) {
        return x.equals(this.premier) || x.equals(this.second);
    }

}
