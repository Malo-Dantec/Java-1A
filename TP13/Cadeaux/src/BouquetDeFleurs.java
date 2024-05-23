public class BouquetDeFleurs implements Cadeau {
    Integer dalhia;
    Integer rose;

    public BouquetDeFleurs(Integer nbdalhia, Integer nbrose) {
        this.dalhia = nbdalhia;
        this.rose = nbrose;
    }
    
    @Override
    public Integer getPoids() {}

    @Override
    public String toString() {}
}
