package concession;

import java.util.ArrayList;

public class Concessionnaire {
    private String adresse;
    private int codePostal;
    private String ville;
    private String marque;
    private ArrayList<Voiture> stock = new ArrayList<Voiture>();

    public Concessionnaire(String adresse, int codePostal, String ville, String marque) {
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public String getStock() {
        return this.stock.toString();
    }

    public boolean ajouterStock(Voiture voiture) {
        if (voiture.getMarque() != this.marque) return false;
        return this.stock.add(voiture);
    }

    public boolean retirerStock(Voiture voiture) {
        return this.stock.remove(voiture);
    }


    @Override
    public String toString() {
        return "Concessionnaire " + this.marque + " \n" +
                "adresse : " + adresse + " \n" +
                "codePostal : " + codePostal + "\n" +
                "ville : " + ville + '\n' +
                "stock : " + stock;
    }

}
