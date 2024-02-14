import java.util.ArrayList;
import java.util.List;
public class Concert {
    private String nomConcert;
    private String nomGroupe;
    private List<Spectateur> LesSpectateurs;

    
    public Concert(String concert, String groupe) {
        this.nomConcert = concert;
        this.nomGroupe = groupe;
        LesSpectateurs = new ArrayList<>();
    }

    public String getGroupe() {
        return this.nomGroupe;
    }

    public String getConcert() {
        return this.nomConcert;
    }

    public void ajouteSpec(Spectateur spectateur) {
        LesSpectateurs.add(spectateur);
    }

    
}
