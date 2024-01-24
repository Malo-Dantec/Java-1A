public class ExecutablePokemon {
    public static void main(String [] args) {
        Pokemon poke;
        poke = new Pokemon("Bulbizarre", 30);
        poke.evolue("Herbizarre", 37);
        poke.evoluer("Florizarre");
        System.out.println(poke.toString()); // (1)
        Pokemon pokem;
        pokem = new Pokemon("Abo", 10);
        pokem.evolue("Arbok", 24);
        System.out.println(pokem.toString());
    }

}