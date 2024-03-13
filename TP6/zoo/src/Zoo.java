import java.util.ArrayList;

public class Zoo {
    private String nom;
    private ArrayList<Animal> LesAnimaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.LesAnimaux = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        LesAnimaux.add(animal);
    }

    public String AnimauxZoo() {
        return "Zoo " + this.nom + " contient " + this.LesAnimaux;
    }

    



}