public class Concert {
    private String nomConcert;
    private String nomGroupe;

    
    public Concert(String concert, String groupe) {
        this.nomConcert = concert;
        this.nomGroupe = groupe;
    }

    public String getGroupe() {
        return this.nomGroupe;
    }

    public String getConcert() {
        return this.nomConcert;
    }


}
