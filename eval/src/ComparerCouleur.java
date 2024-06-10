public class ComparerCouleur implements Comparator<Chaussette> {

    @Override
    public int compare(Chaussette c1, Chaussette c2) {
        if (c1.getCouleur() > c2.getCouleur()) {return -1;}
        if (c1.getCouleur() < c2.getCouleur()) {return 1;}
        return 0;
    }
    
}
