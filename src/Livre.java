public class Livre {

    public static void main(String[] args) {
        Livre bouquin1 = new Livre("Fumio Sasaki", "L'essentiel et rien d'autre");
        Livre bouquin2 = new Livre("Walter Isaacson", "Steve Jobs");
        bouquin1.setNbPages(200);
        bouquin2.setNbPages(900);
        System.out.println("bouquin1 : " + bouquin1.getAuteur());
        System.out.println("nombre de page : " + bouquin1.getNbPages());
        System.out.println("bouquin2 : " + bouquin2.getAuteur());
        System.out.println("nombre de page : " + bouquin2.getNbPages());
        System.out.println("Le nombre de page total : " + (bouquin1.getNbPages() + bouquin2.getNbPages()));
    }

    private String titre, auteur;
    private int nbPages;

    public Livre(String unAuteur, String unTitre) {
        this.auteur = unAuteur;
        this.titre = unTitre;
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

}
