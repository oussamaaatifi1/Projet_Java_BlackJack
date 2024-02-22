import java.util.List;

public class Personne {
    public Hand main;

    public Personne(List<Carte> main) {
        this.main = new Hand("Personne", main);
    }

    public Hand getMain() {
        return main;
    }

    public void tirerCarte(PaquetCartes paquet) {
        Carte carteTiree = paquet.listCartes.remove(0);
        main.ajouterCarte(carteTiree);
    }

    public void afficherMain() {
        main.afficherMain();
    }

    public void calculerValeurTotale() {
        main.calculerValeurTotale();
    }
}
