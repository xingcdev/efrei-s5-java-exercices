public class Livre {
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
