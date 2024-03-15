import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button; 
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;
import javafx.scene.Node;


public class DemineurGraphique extends Application {

    private Demineur leDemineur;
    private Pane infos;
    private GridPane grille;
    
    @Override
    public void init(){
        int nbParametres = this.getParameters().getRaw().size();
        try{
            int lignes = Integer.valueOf(this.getParameters().getRaw().get(0));
            int colonnes = Integer.valueOf(this.getParameters().getRaw().get(1));
            int nbBombes = Integer.valueOf(this.getParameters().getRaw().get(2)); 
            this.leDemineur = new Demineur(lignes, colonnes, nbBombes);
        }
        catch(Exception e){
            this.leDemineur = new Demineur(5, 5, 20);
        }
    }

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(20);
        this.grille = new GridPane();
        this.grille.setHgap(1);
        this.grille.setVgap(1);     
        for (int i = 0; i<this.leDemineur.getNbLignes(); i++){
            for (int j=0; j<this.leDemineur.getNbColonnes(); j++){
                CaseIntelligente laCase = this.leDemineur.getCase(i, j);
                Bouton b = new Bouton(laCase);
                b.setOnMouseClicked(new ControleurBouton(this, this.leDemineur, i, j));
                grille.add(b, i, j);
            }
        }
        
        this.infos = new VBox(); 
        vbox.getChildren().addAll(grille, infos);
        this.maj_des_infos();
        
        Scene scene = new Scene(vbox);
        stage.setTitle("Demineur");
        stage.setScene(scene);
        stage.show();
        this.maj_de_la_grille();
    }

    public void maj_de_la_grille(){
        for (Node b : this.grille.getChildren()){
            Bouton bb = (Bouton) b;
            bb.maj();
        }
    }

    public void rejouer(){
        this.leDemineur.reset();
        this.leDemineur.poseDesBombesAleatoirement();
        this.maj_de_la_grille();
        this.maj_des_infos();
    }
    
    public void desactiver(){
        for (Node b : this.grille.getChildren()){
            b.setDisable(true);
        }
    }

    public void maj_des_infos(){
        this.infos.getChildren().clear();
        Label label1 = new Label("Nombres de contientUneBombes : " + this.leDemineur.getNbTotalBombes());
        Label label2 = new Label("Nombres de cases marquées : " + this.leDemineur.getNbCasesMarquees());
        Label label3 = new Label("score : " + this.leDemineur.getScore());
        this.infos.getChildren().addAll(label1, label2, label3);
    }

    public void messageFinDePartie(){
            String message;
            if (this.leDemineur.estGagnee())
                message = "Vous avez gagné";
            else
                message = "Vous avez perdu !";
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, message+"\nVoulez-vous rejouer ?",ButtonType.YES, ButtonType.NO);
            alert.setTitle("Attention");
            Optional<ButtonType> rep = alert.showAndWait();
            
            if (rep.isPresent() && rep.get()==ButtonType.YES){
                this.rejouer();
            }
            else{
                this.desactiver();
            }  
    }
    
    // public static void main(String args[]){
        // Application.launch(args);
    // }
}
