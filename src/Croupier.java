public class Croupier extends Personne {
    private Main main;
    private int valeurTotaleLimite;

    public Main getMain() {
        return this.main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getValeurTotaleLimite() {
        return this.valeurTotaleLimite;
    }

    public void setValeurTotaleLimite(int valeurTotaleLimite) {
        this.valeurTotaleLimite = valeurTotaleLimite;
    }

    // Constructeur
    public Croupier(String nom, int valeurTotaleLimite) {
        super(nom);
        this.valeurTotaleLimite = valeurTotaleLimite;
        this.main = new Main("Main du Croupier");
    }

    // Autres méthodes spécifiques au croupier
}
