package gestionBibliotheque;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Revue extends Document  {

    private int mois;
    private int annee;

    /**
     * class Document qui prend en paramètres
     * un titre
     * un numéro d'enregistrement
     *
     * @param titre
     * @param numeroEnreg
     * @param mois un entier entre 1 et 12
     * @param annee un entier entre 0 et 9999
     */
    public Revue(String titre, int numeroEnreg, int mois, int annee) throws Exception {
        super(titre, numeroEnreg);
        if (mois < 0 && mois > 12){
            throw new Exception("le mois doit être un chiffre entre 1 et 12");
        }else {
            this.mois = mois;
        }
        if (annee < 0 && annee > 9999){
            throw new Exception("l'année doit être un chiffre entre 0 et 9999");
        }else {
            this.annee = annee;
        }
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return super.toString() + " \n mois "+mois+" .\n année" + annee + " .\n";
    }
}
