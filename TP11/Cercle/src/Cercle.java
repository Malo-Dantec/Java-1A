// import javafx.application.Application; 
// import javafx.scene.Group; 
// import javafx.scene.layout.BorderPane;
// import javafx.scene.Scene; 
// import javafx.stage.Stage; 
// import javafx.scene.paint.Color;
// import java.util.List;
// import java.util.Random;
// import java.util.ArrayList;
// import javafx.scene.shape.Circle;
// import javafx.scene.control.Label;
// import javafx.scene.layout.VBox;
// import javafx.geometry.Pos;
//         // return distance <= this.getRadius() + c.getRadius();

// public class Cercle extends Circle implements Comparable<Cercle> {
//     private static double RAYON_MINI = 30;

//     public Cercle(List<Cercle> liste, double largeur, double hauteur) {
//         this.placerAuHasard(liste, largeur, hauteur);
//     }





    
//     private boolean intersecte(Cercle c) {
//         double distance = Math.sqrt((this.getCenterX() - c.getCenterX()) *
//                                     (this.getCenterX() - c.getCenterX()) +
//                                     (this.getCenterY() - c.getCenterY()) *
//                                     (this.getCenterY() - c.getCenterY()));
//         return (distance <+ this.getRadius() + c.getRadius());
//     }

//     private boolean estDansLeCadre(double largeur, double hauteur) {
//         return (this.getCenterX() - this.getRadius() > 0 &&
//                 this.getCenterX() - this.getRadius() < largeur &&
//                 this.getCenterY() - this.getRadius() > 0 &&
//                 this.getCenterY() - this.getRadius() < hauteur);
//     }

//     private boolean estValide(List<Cercle> liste, double largeur, double hauteur) {
//         boolean res = true;
//         if (this.estDansLeCadre(largeur, hauteur)) {
//             for (Cercle cercle : liste) {
//                 if (this.intersecte(cercle)) {return false;}
//             }
//         }
//         else {res = false;}
//         return res;
//     }

//     private void placerAuHasard(List<Cercle> list, double largeur, double hauteur) {
//         if (this.estValide(list, largeur, hauteur)) {}
//     }






//     @Override
//     public int compareTo(Cercle arg0) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
//     }
// }
