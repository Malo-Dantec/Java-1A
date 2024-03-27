public class Marteau implements Outils {
    
    private String marque;

    public Marteau(String marque) { 
        this.marque = marque; 
    }

    public void taper() { 
        System.out.print("taper");
    }

    public void utiliser() {
        System.out.print("mon marteau " + marque + " permet de ");
        this.taper();
        System.out.println();
    }
}