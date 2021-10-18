public class Livre {

    public static void main(String[] args) {
        Livre bouquin1 = new Livre("Fumio Sasaki", "L'essentiel et rien d'autre", 19.90);
        Livre bouquin2 = new Livre("Walter Isaacson", "Steve Jobs", 9.90);
        bouquin1.setNbPages(200);
        bouquin2.setNbPages(900);
        System.out.println("bouquin1 : " + bouquin1.getAuteur());
        System.out.println("nombre de page : " + bouquin1.getNbPages());
        System.out.println("bouquin2 : " + bouquin2.getAuteur());
        System.out.println("nombre de page : " + bouquin2.getNbPages());
        System.out.println("Le nombre de page total : " + (bouquin1.getNbPages() + bouquin2.getNbPages()));

        // TP 2
        System.out.println("");
        System.out.println("=== TP 2 ===");
        bouquin1.compare(bouquin2);
        System.out.println("Prix du bouquin1 : " + bouquin1.getPrix());
        System.out.println("Prix du bouquin2 : " + bouquin2.getPrix());
        bouquin1.setPrix(0);
        bouquin2.setPrix(-1);
        System.out.println(bouquin1.toString());
        System.out.println(bouquin2.toString());
    }

    private String titre, auteur;
    private int nbPages;
    private double prix;

    public Livre(String auteur, String titre, double prix) {
        this.setAuteur(auteur);
        this.setTitre(titre);
        this.setPrix(prix);
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre(){
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setAuteur(String unAuteur) { this.auteur = unAuteur;}

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(int nbPages) {
        if (nbPages > 0) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre doit être positif.");
        }

    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void compare(Livre livre) {
        if (this.getNbPages() > livre.getNbPages()) {
            System.out.println("<< " + this.getTitre() + " >> " + " a plus de pages que " + "<< " + livre.getTitre() + " >>");
        } else if (this.getNbPages() == livre.getNbPages()){
            System.out.println(this.getTitre() + " et " + livre.getTitre() + " ont le même nombre de page");
        } else {
            System.out.println("<< " + livre.getTitre() + " >> " + " a plus de pages que " + "<< " + this.getTitre() + " >>");
        }
    }

    @Override
    public String toString() {
        String prixMessage;
        if (this.prix == 0) {
            prixMessage = "Gratuit";
        } else if (this.prix <= -1) {
            prixMessage = "Prix pas encore donné";
        } else {
            prixMessage = Double.toString(this.prix);
        }

        return "Livre { " + "\n" +
                "\t" + "titre : " + titre + "\n" +
                "\t" + "auteur : " + auteur + "\n" +
                "\t" + "nbPages : " + nbPages + "\n" +
                "\t" + "prix : " + prixMessage + "\n" +
                " }";
    }
}
