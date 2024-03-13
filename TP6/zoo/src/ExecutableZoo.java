public class ExecutableZoo {
    public static void main(String [] args) {
        Zoo beauval = new Zoo("Beauval");
        Enclos enclosLions = new Enclos("Enclos à lions", 200);
        Enclos enclosSerpent = new Enclos("Enclos à serpents", 100);
        Lion simba = new Lion("Simba", 55.0, enclosLions, false);
        Lion mufasa = new Lion("Mufasa", 120.0, enclosLions, true);
        Serpent kaa = new Serpent("Kaa", 30.0, enclosSerpent, false);

        beauval.addAnimal(simba);
        beauval.addAnimal(mufasa);
        beauval.addAnimal(kaa);

        System.out.println(beauval.AnimauxZoo());


    }
}