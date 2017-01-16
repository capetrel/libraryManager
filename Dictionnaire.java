package gestionBibliotheque;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Dictionnaire extends Document {
    private String language;

    /**
     * class Document qui prend en paramètres
     * un titre
     * un numéro d'enregistrement
     * @param titre
     * @param numeroEnreg
     * @param language
     */
    public Dictionnaire(String titre, int numeroEnreg, String language) throws Exception {
        super(titre, numeroEnreg);
        this.language = language;
    }

    public String getLanguage () {
        return language;
    }

    public void setLanguage (String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + " \n la langue du dictionnaire est : " + language + " .\n";
    }
}
