import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class Achats {
    private Map<Produit, Integer> achats;

    public enum Ordre {NOM, PRIX};

    public Achats() {
        this.achats = new HashMap<>();
    }

    public void ajouterAchat(Produit produit, int quantite) {
        this.achats.put(produit, quantite);
    }

    public double factureTotale() {
        double somme = 0;
        for(Map.Entry<Produit, Integer> entry : this.achats.entrySet()) {
            Produit produit = entry.getKey();
            int quantite = entry.getValue();
            somme += produit.getPrixUnitaire() * quantite;
        }
        return somme;
    }

    public List<Produit> trier(Ordre tri) {
        List<Produit> temp = new ArrayList<>(this.achats.keySet());
        switch(tri) {
            case NOM : Collections.sort(tmp); return tmp;
            case PRIX : Comparator<Produit> comp = new ComparerPrixProduit();
                        Collections.sort(tmp, comp);
                        return tmp;
            default : return tmp;
        }
    }

    @Override
    public String toString() {
        String res = "";
        double prixTotAchat = 0;
        for (Map.Entry<Produit, Integer> entry : this.achats.entrySet()) {
            Produit produit = entry.getKey();
            int quantite = entry.getValue();
            double prixTot = quantite * produit.getPrixUnitaire();
            res += quantite + " " + produit.getNom();
            if(quantite > 1) {res += "s";}
            res += " pour " + prixTot + " euro(s).\n";
            prixTotAchat += prixTot;
            
        }
        return res += "Prix total de vos achats : " + prixTotAchat + "\n";
    }
}