import java.util.List;

public class Croupier extends Personne implements CroupierInterface {
    private int valeurTotalLimit;
    
    public Croupier(List<Carte> main, int valeurTotalLimit) {
        super(main);
        this.valeurTotalLimit = valeurTotalLimit;
    }

    public void distribuerCartes(PaquetCartes paquet, Joueur joueur) {
        tirerCarte(paquet);
        joueur.tirerCarte(paquet);
        tirerCarte(paquet);
    }

    public void revelerCarteCachee() {
        System.out.println("\n ___ Croupier's Hidden Card: ___");
        System.out.println("Couleur: " + main.listCartes.get(0).couleur + ", Valeur: " + main.listCartes.get(0).valeur);
    }

    public void tirerCarteSupplementaire(PaquetCartes paquet) {
        tirerCarte(paquet);
        while (main.valeurTotal < valeurTotalLimit) {
            tirerCarte(paquet);
        }
    }

    public void comparerMains(Joueur joueur) {
        int resultat = Integer.compare(main.valeurTotal, joueur.main.valeurTotal);
        if (resultat > 0) {
            System.out.println("Croupier wins!");
        } else if (resultat < 0) {
            System.out.println("Joueur wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public void afficherMainEtCarteCachee() {
        System.out.println("* * * Croupier's Hand: * * *");
        System.out.println("- - - Visible Card: - - -");
        System.out.println("Couleur: " + main.listCartes.get(1).couleur + ", Valeur: " + main.listCartes.get(1).valeur);
        System.out.println("Hidden Card: (Not revealed yet)");
    }

    @Override
    public void comparerMains() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comparerMains'");
    }

    @Override
    public void tirerCarteSupplementaire() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tirerCarteSupplementaire'");
    }

    @Override
    public void distribuerCartes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'distribuerCartes'");
    }
}
