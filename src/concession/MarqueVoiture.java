package concession;

public enum MarqueVoiture {
    CITROEN("citroen"),
    RENAULT("renault"),
    PEUGEOT("peugeot");
    private final String libelle;

    MarqueVoiture(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return libelle;
    }
}
