import java.util.List;
import java.util.Scanner;

public class Joueur extends Personne implements PersonneInterface {
    private String username;
    private int solde;
    private int mise;

    public Joueur(String username, int solde, List<Carte> main) {
        super(main);
        this.username = username;
        this.solde = solde;
        this.mise = 0;
    }
    

    public void placerMise() {
        try (Scanner scanner1 = new Scanner(System.in)) {
            System.out.println(username + ", enter your bet:");
            int bet = scanner1.nextInt();

            while (bet <= 0 || bet > solde) {
                System.out.println("Invalid bet. Please enter a valid bet between 1 and " + solde);
                bet = scanner1.nextInt();
            }

            mise = bet;
        }
        solde -= mise;
        System.out.println("Bet placed: " + mise);
    }

    public void recevoirCartesInitiales(List<Carte> cartes) {
        main.setListCartes(cartes);
        calculerValeurTotale();
    }

    public void tirerCarte(PaquetCartes paquet) {
        super.tirerCarte(paquet);
    }

    public void rester() {
        System.out.println(username + " chose to stand.");
    }

    public void afficherMainEtSolde() {
        System.out.println(username + "'s Hand:");
        afficherMain();
        System.out.println("Total Value: " + main.valeurTotal);
        System.out.println("Current Balance: " + solde);
    }

    public void resultatPartie(int resultat) {
        switch (resultat) {
            case 0:
                System.out.println(username + " has won!");
                solde += 2 * mise; // Player wins, gets double the bet
                break;
            case 1:
                System.out.println(username + " has lost!");
                // Player loses, no change in balance
                break;
            default:
                System.out.println("It's a tie! " + username + " gets back the bet.");
                solde += mise; // It's a tie, player gets back the bet
        }

        mise = 0; // Reset the bet for the next round
    }
}
