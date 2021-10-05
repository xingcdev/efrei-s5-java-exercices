public class App {
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
}
