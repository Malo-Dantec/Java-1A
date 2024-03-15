import javafx.event.EventHandler; 
import javafx.scene.input.MouseEvent; 
import javafx.scene.input.MouseButton;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;

public class ControleurBouton implements EventHandler<MouseEvent>{
    
    private DemineurGraphique graphique;
    private Demineur demineur;
    private int x, y;
    
    public ControleurBouton(DemineurGraphique graphique, Demineur demineur, int x, int y){
        this.graphique = graphique;
        this.demineur = demineur;
        this.x = x;
        this.y = y;
    }

    @Override
    public void handle(MouseEvent e) {
        if (e.getButton() == MouseButton.PRIMARY){
            System.out.println("clic gauche");
            this.demineur.reveler(this.x, this.y);
            this.maj();
        }
        if(e.getButton() == MouseButton.SECONDARY){
            System.out.println("clic droit");
            this.demineur.marquer(this.x, this.y);
            this.maj();            
        }
    }
    
    private void maj(){
        this.graphique.maj_des_infos();
        this.graphique.maj_de_la_grille();
        
        if (this.demineur.estPerdue() || this.demineur.estGagnee()){
            this.graphique.messageFinDePartie();         
        }      
    }
    
}
