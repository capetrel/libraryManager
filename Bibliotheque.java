package gestionBibliotheque;

/**
 * Created by capetrel on 26/04/2016.
 */
class Bibliotheque {

    private Document[] tableauDocs;
    private int currentPosition;

    public Bibliotheque(int capacite) {
        tableauDocs = new Document[capacite];
        currentPosition = 0;
    }

    /**
     * méthode pour ajouter un document dans la bibliothèque
     * */
    public boolean ajouterDoc(Document doc)    {
        if(currentPosition < tableauDocs.length) {
            tableauDocs[currentPosition] = doc;
            currentPosition++;
            return true;
        }else {
            return false;
        }
    }
    /**
     * méthode pour supprimer un document dans la bibliothèque
     * */


    /**
     * méthode pour savoir la quantité de document dans la bibliothèque
     * */
    public int getNbDocs(){
        /*int compteur = 0;

        for(int i=0; i < tableauDocs.length-1; i++){
            if( tableauDocs[i] != null )    {
                compteur++;
            }
        }

        return compteur;*/
        return currentPosition;
    }

    /**
     * affiche les ouvrages dans la bibliothèque.
     * */
    public void afficherDocuments(){
        for(int i=0; i < currentPosition; i++) {
            System.out.println(tableauDocs[i]);
        }
    }

    /**
     * méthode pour savoir la quantité de document dans la bibliothèque
     * */


}
