package gestionBibliotheque;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Manuel extends Livre {
    private String niveau;

    /**
     * class Document qui prend en paramètres
     * un titre
     * un numéro d'enregistrement
     *
     * @param titre
     * @param numeroEnreg
     * @param auteur
     * @param nbrPages
     * @param niveau
     */
    public Manuel(String titre, int numeroEnreg, String auteur, int nbrPages, String niveau) throws Exception {
        super(titre, numeroEnreg, auteur, nbrPages);
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return super.toString() + " le niveau est : " + niveau + " .\n";
    }
}
