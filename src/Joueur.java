public class Joueur extends Personne {
    private double solde;
    private Main main;

    // Constructeur
    public Joueur(String nom, double solde) {
        super(nom);
        this.solde = solde;
        this.main = new Main("Main du Joueur");
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Main getMain() {
        return this.main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    // Autres méthodes spécifiques au joueur
}