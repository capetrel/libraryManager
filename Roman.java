package gestionBibliotheque;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Roman extends Livre {
    private String prixLitt;
    /**
     * class Document qui prend en paramètres
     * un titre
     * un numéro d'enregistrement
     *
     * @param titre
     * @param numeroEnreg
     * @param auteur
     * @param nbrPages
     * @param prixLitt
     */
    public Roman(String titre, int numeroEnreg, String auteur, int nbrPages, String prixLitt) throws Exception {
        super(titre, numeroEnreg, auteur, nbrPages);
        this.prixLitt = prixLitt;
    }

    public String getPrixLitt(){ return prixLitt;}

    public void setPrixLitt(String prixLitt) {
        this.prixLitt = prixLitt;
    }

    @Override
    public String toString() {
        return super.toString() + " il à reçu le prix : " + prixLitt + " .\n";
    }
}
