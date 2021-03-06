package concession;

public class testConcession {
    public static void main(String[] args) {
        Concessionnaire citroen = new Concessionnaire("3 rue maurice arnaud", 92120, "Montrouge", MarqueVoiture.CITROEN.toString());
        Concessionnaire peugeot = new Concessionnaire("5 avenue jean jaures", 94200, "Ivry-sur-Seine", MarqueVoiture.PEUGEOT.toString());
        Concessionnaire renault = new Concessionnaire("13 rue flemme", 94800, "Villejuif", MarqueVoiture.RENAULT.toString());

        citroen.ajouterStock(new Voiture("bleu", MarqueVoiture.CITROEN.toString(), "c1", "citadine", "Michelin", 12.5));
        citroen.ajouterStock(new Voiture("rouge", MarqueVoiture.CITROEN.toString(), "c2", "citadine", "Michelin", 12.5));
        citroen.ajouterStock(new Voiture("bleu marine", MarqueVoiture.CITROEN.toString(), "c4", "routiere", "Michelin", 12.5));

        peugeot.ajouterStock(new Voiture("rouge", MarqueVoiture.PEUGEOT.toString(), "208", "citadine", "Michelin", 12.5));
        peugeot.ajouterStock(new Voiture("rouge", MarqueVoiture.PEUGEOT.toString(), "208gti", "sportive", "Michelin", 12.5));
        peugeot.ajouterStock(new Voiture("noir", MarqueVoiture.PEUGEOT.toString(), "508", "routiere", "Michelin", 12.5));

        renault.ajouterStock(new Voiture("noir",  MarqueVoiture.RENAULT.toString(), "twingo", "citadine", "Continental", 12.5));
        renault.ajouterStock(new Voiture("noir",  MarqueVoiture.RENAULT.toString(), "clio", "citadine","Continental", 12.5));
        renault.ajouterStock(new Voiture("noir",  MarqueVoiture.RENAULT.toString(), "laguna", "routiere","Continental", 12.5));
        System.out.println(citroen.toString());
        System.out.println("======");
        System.out.println(peugeot.toString());
        System.out.println("======");
        System.out.println(renault.toString());




    }
}
