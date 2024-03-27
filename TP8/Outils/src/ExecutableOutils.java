import java.util.ArrayList;
import java.util.List;

public class ExecutableOutils {
    public static void main ( String [] args ) {

        List < Outils > boiteAOutils = new ArrayList < >() ;
        boiteAOutils . add (new Marteau ( "Expert" ) ) ;
        boiteAOutils . add (new Marteau ( "PowerGrip" ) ) ;
        boiteAOutils . add (new Ciseau ( "HPC" ) ) ;
        boiteAOutils . add (new Ciseau ( "SoftLine" ) ) ;
        boiteAOutils . add (new Secateur ( "Laguiole" ) ) ;
        for( Outils outil : boiteAOutils ) {
            outil . utiliser () ;
        }

    }
}