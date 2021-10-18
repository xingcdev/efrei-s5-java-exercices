package concession;
import java.util.Arrays;

public class Voiture {
    private String couleur;
    private String marque;
    private String modele;
    private String categorie;
    private Pneu[] pneux  = new Pneu[4];

    public Voiture(String couleur, String marque, String modele, String categorie, String marquePneu, double largeurPneu) {
        this.couleur = couleur;
        this.marque = marque;
        this.modele = modele;
        this.categorie = categorie;
        for (int i = 0; i < pneux.length; i++) {
            pneux[i] = new Pneu(marquePneu,largeurPneu);
        }
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
                ", pneux='" + Arrays.toString(pneux) + '\'' +
                '}';
    }
}
