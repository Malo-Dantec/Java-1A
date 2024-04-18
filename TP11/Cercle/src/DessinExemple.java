/* constructeur Circle à trois paramètres 
Circle(double centerX, double centerY, double radius)

On trouve setFill dans la classe class javafx.scene.shape.Shape mise à jour de la couleur (peinture) Paint value, or Paint est une classe abstraite dont un des héritiers est Color. 
constructeur de Color : 4 paramètres dont le dernier est opacité. les 3 premiers sont des valeurs aléatoires de rouge vert et bleu (comprises entre 0 et 1) 
    red - red component ranging from 0 to 1
    green - green component ranging from 0 to 1
    blue - blue component ranging from 0 to 1
    opacity - opacity ranging from 0 to 1


Compilation :

javac --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls DessinExemple.java

Execution :

java --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls DessinExemple

*/ 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.paint.Color;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class DessinExemple extends Application {
    
    private int largeur = 600;
    private int hauteur = 300;
    private List<Circle> liste;
    
    // === Début du code à compléter / modifier ===========
        
    @Override
    public void init(){
        this.liste = new ArrayList<>();
        
        for (int i = 0 ; i < 10 ; i++) {
            Circle c = new Circle(Math.random() * this.largeur, Math.random() * this.hauteur, Math.random() * 30);
            c.setFill(new Color(Math.random(), Math.random(), Math.random(), 1.0));
            this.liste.add(c);
        }
	}


    // === Fin du code à compléter / modifier ===========
     
    @Override 
    public void start(Stage stage) { 
       Group dessinCercles = new Group();
       dessinCercles.getChildren().addAll(this.liste);
       BorderPane root = new BorderPane();
       root.setCenter(dessinCercles);
       VBox infos = this.informations();
       root.setBottom(infos);
       root.setAlignment(infos, Pos.TOP_LEFT);
       Scene scene = new Scene(root, this.largeur,
			       this.hauteur + infos.getHeight() + 40);  
       stage.setTitle("Formes");
       stage.setScene(scene);
       stage.show();         
    }   
      
    private VBox informations(){
        VBox vbox = new VBox();
        String cssLayout = "-fx-border-color: black;\n" +
	    "-fx-border-width: 2;\n";
        vbox.setStyle(cssLayout);
        // Code à compléter à partir de l'exercice 7
	
        // vbox.getChildren().add(new Label("Le Cercle le plus petit est : "+ BibCercles.getMin(liste).toString())); 
        // vbox.getChildren().add(new Label("La surface totale est : "+ BibCercles.surfaceTotale(liste)));
        return vbox;      
    }
    
    public static void main(String args[]){ 
       launch(args); 
   } 
}       
