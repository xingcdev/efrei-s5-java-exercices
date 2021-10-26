package exceptions;

public class oubliStupide {
    public static void main(String[] args) {
        int[] tab = null;
        try {
            System.out.println(tab[2]);
        } catch (NullPointerException e) {
            System.out.println("Le tableau est null");
        }
    }
}
