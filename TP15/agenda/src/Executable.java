import java.text.ParseException ;
class Executable{

    public static void main(String[] args)
    {
        Agenda agenda = new Agenda();
        try{
	        agenda.ajoute(new RendezVous("10:05/05/03/2023", 
                                             "10:15/05/03/2023"));
            agenda.ajoute(new RendezVous("11:10/05/04/2023", 
                                             "11:25/05/04/2023"));
            agenda.ajoute(new RendezVous("09:00/05/03/2023", 
                                             "09:15/05/03/2023"));
            agenda.ajoute(new RendezVous("08:30/05/03/2023", 
                                             "08:45/05/03/2023"));
            agenda.ajoute(new RendezVous("12:10/05/03/2023", 
                                             "12:30/05/03/2023"));
            System.out.println("Affichage Agenda itérable ");
            for (RendezVous rendezVous : agenda) {
                System.out.println(rendezVous);
            }

            agenda.ajoute(new RendezVous("12:10/05/03/2023", 
                                         "12:30/05/03/2023"));
            
            System.out.println("Premier rendez-vous de la journée"
                               + agenda.getPremier());
        }
        catch(ParseException e)
        {
            System.out.println("erreur de saisie " + e);
        }
        catch(PasDeDisponibiliteException e){
            System.out.println(e);
            System.out.println(e.getRendezVous()); 
        }
	    catch(AgendaVideException e) {
	        System.out.println(" Attention " + e); 
	    }
    }
}
