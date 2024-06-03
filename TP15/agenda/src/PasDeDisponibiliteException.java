public class PasDeDisponibiliteException 
            extends Exception {
    private final RendezVous rendezVous;
    public PasDeDisponibiliteException(String message,
                                       RendezVous rendezVous) {
        super(message);
        this.rendezVous = rendezVous;
    }

    public RendezVous getRendezVous() {
        return this.rendezVous;
    }
}