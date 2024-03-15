import javafx.scene.control.Button; 
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill ;
import javafx.scene.paint.Color ;

public class Bouton extends Button{
    
    private CaseIntelligente laCase;

    public Bouton(CaseIntelligente laCase){
        super();
        this.setPrefWidth(35);
        this.setPrefHeight(35);
        this.laCase = laCase;        
    }

    public void maj(){
        if (this.laCase.estDecouverte()){
            this.setDisable(true);
        }
        else {
            this.setDisable(false);
        }
        this.setText(this.laCase.toString());
        
        // Couleur
        if (this.laCase.estDecouverte()){            
            if (this.laCase.contientUneBombe()){
                this.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
            }
            else{
                this.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, null, null)));
            }
        }
        else if (this.laCase.estMarquee()){
            this.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));           
            }
        else{
            this.setBackground(new Background(new BackgroundFill(Color.GAINSBORO, null, null)));
        }
    }
}
