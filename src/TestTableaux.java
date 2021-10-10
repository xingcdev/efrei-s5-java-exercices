import java.util.Random;

public class TestTableaux {
    public static void main(String[] args) {
        int[] unTableau = new int[5];
        int[] secondTableau = {2,2,2,2};

        TestTableaux testTableau = new TestTableaux();
        testTableau.generer(unTableau);
        testTableau.afficher(unTableau);
        System.out.println("Nombre maximum : " + testTableau.maximum(unTableau));
        System.out.println("Somme : " + testTableau.somme(unTableau));
        System.out.println("Moyenne : " + testTableau.moyenne(unTableau));
        System.out.println("tous égaux ? : " + testTableau.tousEgaux(unTableau));
        System.out.println("2 tableaux égaux ? : " + testTableau.egaux(unTableau, secondTableau));
        System.out.println("3 est-il dans le tableau ? : " + testTableau.recherche(unTableau, 3));
        System.out.println("est trié ? : " + testTableau.estTrie(unTableau));
    }

    public boolean estVide(int []tableau) {
        if (tableau.length == 0) {
            return true;
        }
        return false;
    }

    public void afficher( int []tableau) {
        if (estVide(tableau)) {
            System.out.println("Tableau vide");
        } else {
            System.out.print("Le tableau : { ");
            for (int i = 0; i < tableau.length; i++) {
                System.out.print(tableau[i] + ", ");
            }
            System.out.println("}");
        }
    }

    public void generer(int []tableau) {
        Random random = new Random();
        int randomNombre;
        for (int i = 0; i < tableau.length; i++) {
            //Nombre aléatoire entre 0 et 10
            randomNombre =  random.nextInt(11);
            tableau[i] = randomNombre;
        }
    }

    public int maximum(int []tableau) {
        if (estVide(tableau)) return 0;
        
        int nombreMax = 0;
        for (int nombre : tableau) {
            if (nombre > nombreMax) {
                nombreMax = nombre;
            }
        }
        return nombreMax;
    }

    public double somme (int []tableau) {
        if (estVide(tableau)) return 0;

        double somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }

    public double moyenne (int []tableau) {
        if (estVide(tableau)) return 0;

        double somme = this.somme(tableau);
        return somme/tableau.length;
    }

    public boolean tousEgaux (int[] tableau) {
        if (estVide(tableau)) return false;

        int nbrPrecedent;
        int nbrActuel;
//        On parcour le tableau à partir du 2eme element
        for (int i = 1; i < tableau.length; i++) {
             nbrPrecedent = tableau[i - 1];
             nbrActuel = tableau[i];
             if (nbrPrecedent != nbrActuel) return false;
        }
        return true;
    }

    public boolean egaux(int[] tableau1, int[] tableau2) {
        if (estVide(tableau1) || estVide(tableau2)) return false;
        if (tableau1.length != tableau2.length) return false;

        for (int i = 0; i < tableau1.length; i++) {
            if (tableau1[i] != tableau2[i]) return false;
        }
        return true;
    }

    public boolean recherche(int[] tableau, int nbrRecherche) {
        if (estVide(tableau)) return false;

        for (int nombre : tableau) {
            if (nbrRecherche == nombre) return true;
        }
        return false;
    }

    public boolean estTrie(int[] tableau) {
        if (estVide(tableau)) return false;

        int nbrSuivant;
        int nbrActuel;

        for (int i = 0; i < tableau.length -1; i++) {
            nbrSuivant = tableau[i + 1];
            nbrActuel = tableau[i];
            if (nbrActuel > nbrSuivant ) return false;
        }
        return true;
    }
}
