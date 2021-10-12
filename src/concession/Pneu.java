package concession;

public class Pneu {
    private String marque;
    private double largeur;

    public Pneu(String marque, double largeur) {
        this.marque = marque;
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "marque='" + marque + '\'' +
                ", largeur=" + largeur +
                '}';
    }
}
