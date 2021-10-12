package concession;

import java.util.ArrayList;

public class Voiture {
    private String couleur;
    private String marque;
    private String modele;
    private String categorie;
    private ArrayList<Pneu> pneux  = new ArrayList<Pneu>();

    public Voiture(String couleur, String marque, String modele, String categorie) {
        this.couleur = couleur;
        this.marque = marque;
        this.modele = modele;
        this.categorie = categorie;
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
