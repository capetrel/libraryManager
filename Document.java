package gestionBibliotheque;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Document {
    private String titre;
    private int numeroEnreg;

    /**
     * class Document qui prend en paramètres
     * un titre
     * un numéro d'enregistrement
     * */
    public Document(String titre, int numeroEnreg) throws Exception {
        this.titre = titre;
        if (numeroEnreg < 0){
            throw new Exception("Le numero d'enregistrement ne peux pas être négatif");
        }
        this.numeroEnreg = numeroEnreg;
    }

    /**
     * les assésseur pour permettre la saisie du titre et du numéro.
     * */
    public int getNumeroEnreg() {
        return numeroEnreg;
    }

    public void setNumeroEnreg(int numeroEnreg) {
        this.numeroEnreg = numeroEnreg;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    /**
     * to string permettra d'afficher le titre et le numéro
     * quand on fera un println.
     * */
    @Override
    public String toString() {
        return "Titre : " + titre + " . \n Numéro d'enregistrement : " + numeroEnreg + " .";
    }
}