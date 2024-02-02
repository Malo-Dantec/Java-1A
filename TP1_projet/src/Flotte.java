import java.util.ArrayList;
import java.util.List;
public class Flotte {
    private List<Vaisseau> flotte;
    private String nom;

    public Flotte(String nom) {
        this.nom = nom;
        this.flotte = new ArrayList<>();
    }

    public Flotte() {
        this.nom = "Nouvelle Flotte.";
        this.flotte = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public void ajoute(Vaisseau vaisseau) {
        flotte.add(new Vaisseau(vaisseau.getNom(), 
                                vaisseau.getPuissance(), 
                                vaisseau.getNombrePassagers()));
    }

    public void ajoute(String nom, int puissance) {
        flotte.add(new Vaisseau(nom, puissance));
    }

    public void ajoute(String nom, int puissance, int nombreDePassagers) {
        flotte.add(new Vaisseau(nom, puissance, nombreDePassagers));
    }

    public int nombreVaisseaux() {
        return flotte.size();
    }

    public int totalPuissance() {
        int res = 0;
        for (Vaisseau vaisseau : this.flotte) {
            res += vaisseau.getPuissance();
        }
        return res;
    }

    public int totalPassagers() {
        int res = 0;
        for (Vaisseau vaisseau : this.flotte) {
            res += vaisseau.getNombrePassagers();
        }
        return res;
    }


    // public int nombreDeVaisseauxSansPassagers() {
    //     int res = 0;
    //     for (Vaisseau vaisseau : this.flotte) {

    //     }
    //     return res;
    // }   
    
    public int puissanceDeFeuMax() {
        int res = 0;
        for (Vaisseau vaisseau : this.flotte) {
            if (vaisseau.getPuissance() > res) res = vaisseau.getPuissance();
        }
        return res;
    }

    public String nomDuVaisseauLeMoinsPuissant() {
        int puissanceMin = 0;
        String nomMoinsPuissant = "";
        for (Vaisseau vaisseau : this.flotte) {
            if (vaisseau.getPuissance() < puissanceMin || nomMoinsPuissant == "")
                puissanceMin = vaisseau.getPuissance();
                nomMoinsPuissant = vaisseau.getNom();
        }
        return nomMoinsPuissant;
    }



}