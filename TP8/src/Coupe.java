public abstract class Coupe implements Outils{
    
    private String marque;

    public Coupe(String marque) { 
        this.marque = marque;
    }
    public void couper () {
        System.out.print("couper");
    }

    @Override
    public void utiliser () {
        System.out.print(this.marque + " permet de ") ;
        this.couper() ;
        System.out.println () ;
    }
}
