public class Executable {
    public static void main ( String [] args ) {
    Ville orleans = new Ville("Orléans" , 114644);
    Ville olivet = new Ville("Olivet" , 21639);
    Ville cenabum = new Ville("Orléans" , 114644);
    assert orleans.getNbHabitants() == 114644;
    assert orleans.getNom().equals("Orléans");
    assert !orleans.equals(olivet);
    assert orleans.equals(orleans);
    assert orleans.equals(cenabum);

    Region cvl = new Region("cvl")




    System.out.println(orleans.VilleParRegion());
    }

}
