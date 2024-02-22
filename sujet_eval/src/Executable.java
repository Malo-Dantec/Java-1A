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

    Region cvl = new Region("cvl");

    cvl.ajouteVille(orleans);
    cvl.ajouteVille(cenabum);
    cvl.ajouteVille(olivet);
    System.out.println(cvl.VilleParRegion());
    cvl.trierParNbHabitants();
    System.out.println(cvl.VilleParRegion());

    }
}
