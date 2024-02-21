import java.util.ArrayList;

public class Region {
    private String nom;
    private ArrayList<Ville> LesVilles;

    public Region(String nom) {
        this.nom = nom;
    }

    public void ajouteVille(Ville ville) {
        if (!(this.LesVilles.contains(ville))) {
            this.LesVilles.add(ville);
        }
    }

    public void ajouteVille(String nom, int nbHabitants) {
        if (!(this.LesVilles.contains(new Ville(nom, nbHabitants)))) {
            this.LesVilles.add(new Ville(nom, nbHabitants));
        }
    }

    public int nbVilles() {
        return this.LesVilles.size();
    }

    public int nbHabitantsRegion() {
        int res = 0;
        for (Ville ville : this.LesVilles) {
            res += ville.getNbHabitants();
        }
        return res;
    }

    public Ville laMoinspeuplee() {
        Ville laMoinsPeuplee = null;
        for (Ville ville : this.LesVilles) {
            if (laMoinsPeuplee == null) {laMoinsPeuplee = ville;}
            else if (laMoinsPeuplee.getNbHabitants() > ville.getNbHabitants()) {laMoinsPeuplee = ville;}
        }
        return laMoinsPeuplee;
    }

}
