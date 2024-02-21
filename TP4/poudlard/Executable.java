public class Executable {
    public static void main(String [] args) {

        Ecole poudlard = new Ecole("Poudlard");

        
        Maison serpentar = new Maison("Serpentar");
        Maison griffondor = new Maison("Griffondor");
        Maison serdaigle = new Maison("Serdaigle");
        Maison poufsouffle = new Maison("Poufsouffle");

        System.out.println(poudlard.getMaisons().contains(new Maison("Serpentar")));
        System.out.println(poudlard.getMaisons().contains(new Maison("Griffondor")));

        poudlard.ajouter(serpentar);
        poudlard.ajouter(griffondor);
        poudlard.ajouter(serdaigle);
        poudlard.ajouter(poufsouffle);

        System.out.println(poudlard.getMaisons().contains(new Maison("Serpentar")));
        System.out.println(poudlard.getMaisons().contains(new Maison("Griffondor")));

        System.out.println(serpentar.getEleves().contains(new Sorcier("Adrian", 9, 7)));
        System.out.println(serpentar.nombreEleve());
        System.out.println(serpentar.contientCourageux());

        serpentar.ajouter("Adrian", 9, 7);

        System.out.println(serpentar.contientCourageux());
        System.out.println(serpentar.nombreEleve());
        System.out.println(serpentar.getEleves().contains(new Sorcier("Adrian", 9, 7)));
        
        griffondor.ajouter("Hermione", 8, 6);
        serdaigle.ajouter("Luna", 2, 9);
        serpentar.ajouter("Drago", 6, 5);
        poufsouffle.ajouter("Norbert", 3, 7);
        griffondor.ajouter("Neuville", 10, 4);
        serpentar.ajouter("Pansy", 4, 10);
        serpentar.ajouter("Gregory", 6, 7);
        serdaigle.ajouter("Gilderoy", 7, 9);
        griffondor.ajouter("Dean", 9, 4);

        System.out.println(poudlard.plusGrandeMaison().getNom());
        System.out.println(poudlard.lesCourageux());
        System.out.println(serpentar.leMoinsCourageux().getNom());

        System.out.println(serpentar.getEleves());
        serpentar.trierParCourage();
        System.out.println(serpentar.getEleves());

    }
}