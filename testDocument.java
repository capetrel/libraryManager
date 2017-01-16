package gestionBibliotheque;

import java.util.Scanner;

/**
 * Created by capetrel on 26/04/2016.
 */
public class testDocument {

    public static void main(String[] args) throws Exception {
        /*System.out.println("entrez le titre :");
        Scanner scanner = new Scanner(System.in);
        String titre = scanner.nextLine();*/

        Livre livre1;
        livre1 = new Livre("le beau temps", 1, "Claude Lelouche", 200);

        Manuel manuel1;
        manuel1 = new Manuel("L'histoire d'un soir", 2, "Lamartine", 46, "débutant");

        Dictionnaire dico1;
        dico1 = new Dictionnaire("Larousse 2015", 3,"Français");

        Revue revue1;
        revue1 = new Revue("Legorafuze", 4, 4, 2016);

        Roman roman1;
        roman1 = new Roman("L'éléphant se trompe énormément", 5, "George Lafouine", 254, "Goncourt");

        /*
        System.out.println(livre1);
        System.out.println(manuel1);
        System.out.println(dico1);
        System.out.println(revue1);
        System.out.println(roman1);
        */

        Bibliotheque bibliotheque = new Bibliotheque(10);
        System.out.println(bibliotheque.getNbDocs());
        bibliotheque.ajouterDoc(roman1);
        System.out.println(bibliotheque.getNbDocs());
        bibliotheque.ajouterDoc(livre1);
        System.out.println(bibliotheque.getNbDocs());

        bibliotheque.afficherDocuments();



    }
}
