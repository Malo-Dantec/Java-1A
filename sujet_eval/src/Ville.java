public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbHabitants() {
        return this.nbHabitants;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {return false;}
        if (o == this) {return true;}
        if (!(o instanceof Ville)) {return false;}
        Ville ville = (Ville) o;
        return ville.getNom().equals(this.getNom()) && ville.getNbHabitants() == this.getNbHabitants();
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
