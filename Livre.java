package gestionBibliotheque;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Livre extends Document {

    private String auteur;
    private int nbrPages;

    /**
     * class Document qui prend en paramètres
     * un titre
     * un numéro d'enregistrement
     * @param titre
     * @param numeroEnreg
     * @param auteur
     * @param nbrPages
     */
    public Livre(String titre, int numeroEnreg, String auteur, int nbrPages) throws Exception {
        super(titre, numeroEnreg);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    @Override
    public String toString() {
        return super.toString() + " \n auteur : "+auteur+" .\n nombre de page " + nbrPages+ " .\n";
    }
}
