import java.util.List;
import java.util.Collections;

public class ListePersonnes {
    private List<Personne> liste;

    public ListePersonnes(List<Personne> liste) {
        this.liste = liste;
    }

    public void trier() {
        Collections.sort(this.liste, new ComparateurAge());
    }

    public int ecartMin() {
        int res = this.liste.get(1).getAge() - this.liste.get(0).getAge();
        for(int i = 0; i < this.liste.size() -1 ; i++) {
            if (this.liste.get(i+1).getAge() - this.liste.get(i).getAge() < res) {res = this.liste.get(i+1).getAge() - this.liste.get(i).getAge();}
        }
        return res;
    }

    @Override
    public String toString() {
        return liste.toString();
    }
}
