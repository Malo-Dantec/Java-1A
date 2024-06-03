import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;
import java.lang.Comparable;
import java.text.ParseException;

class RendezVous implements Comparable<RendezVous>, Serializable {
    
    private Date debut;
    private Date fin;
    
    public RendezVous(String deb, String fin) throws ParseException{
        SimpleDateFormat lecteur = new SimpleDateFormat("HH:mm/dd/MM/yyyy");
        this.debut = lecteur.parse(deb);
        this.fin = lecteur.parse(fin);
	
    }
    @Override
    public String toString(){
        return "Rendez vous de " + this.debut + " à " + this.fin;
    }
    @Override
    public int compareTo(RendezVous v)
    {
        return this.debut.compareTo(v.debut);
    }
    
    @Override
    public boolean equals(Object objet) {
        if (objet == null) {
            return false;
        }
        if (objet == this) {
            return true;
        }
        if (objet instanceof RendezVous) {
            RendezVous rendezVous = (RendezVous)objet; 
            return this.debut.equals(rendezVous.debut) &&
                   this.fin.equals(rendezVous.fin);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * this.debut.hashCode() + 37 * this.fin.hashCode();
    }

    /**
     * permet de savoir si deux rendez-vous s'intersectent
     * @param rendezVous le rendez vous 
     * @return un booléen indiquant si les 
     *         rendez-vous s'intersectent
     */
    public boolean intersecte(RendezVous rendezVous)
    {
        return
	        this.debut.compareTo(rendezVous.debut) * 
            this.debut.compareTo(rendezVous.fin) < 0 ||
	        this.fin.compareTo(rendezVous.debut) *
            this.fin.compareTo(rendezVous.fin) < 0  ||
	        (this.debut.compareTo(rendezVous.debut)== 0 && 
            this.fin.compareTo(rendezVous.fin) == 0);
    }
}
