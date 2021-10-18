package concession;

public class testConcession {
    public static void main(String[] args) {
        Concessionnaire citroen = new Concessionnaire("3 rue maurice arnaud", 92120, "Montrouge", "citroen");
        Concessionnaire peugeot = new Concessionnaire("5 avenue jean jaures", 94200, "Ivry-sur-Seine", "peugeot");
        Concessionnaire renault = new Concessionnaire("13 rue flemme", 94800, "Villejuif", "renault");

        citroen.ajouterStock(new Voiture("bleu", "citroen", "c1", "citadine", "Michelin", 12.5));
        citroen.ajouterStock(new Voiture("rouge", "citroen", "c2", "citadine", "Michelin", 12.5));
        citroen.ajouterStock(new Voiture("bleu marine", "citroen", "c4", "routiere", "Michelin", 12.5));

        peugeot.ajouterStock(new Voiture("rouge", "peugeot", "208", "citadine", "Michelin", 12.5));
        peugeot.ajouterStock(new Voiture("rouge", "peugeot", "208gti", "sportive", "Michelin", 12.5));
        peugeot.ajouterStock(new Voiture("noir", "peugeot", "508", "routiere", "Michelin", 12.5));

        renault.ajouterStock(new Voiture("noir", "renault", "twingo", "citadine", "Continental", 12.5));
        renault.ajouterStock(new Voiture("noir", "renault", "clio", "citadine","Continental", 12.5));
        renault.ajouterStock(new Voiture("noir", "renault", "laguna", "routiere","Continental", 12.5));
        System.out.println(citroen.toString());
        System.out.println("======");
        System.out.println(peugeot.toString());
        System.out.println("======");
        System.out.println(renault.toString());
    }
}
