import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    private Joueur joueur;
    private Croupier croupier;
    private PaquetCartes paquet;

    public BlackJack(Joueur joueur, Croupier croupier, PaquetCartes paquet) {
        this.joueur = joueur;
        this.croupier = croupier;
        this.paquet = paquet;
    }

    public void demarrerPartie() {
        System.out.println("Welcome to Blackjack!");

        // Initialize the game
        paquet.initialiserPaquet();
        paquet.melangerCartes();

        // Place bets
        joueur.placerMise();

        // Deal initial cards
        croupier.distribuerCartes(paquet, joueur);
        croupier.afficherMainEtCarteCachee();
        joueur.afficherMainEtSolde();

        // Player's turn
        jouerTourJoueur();

        // Croupier's turn
        jouerTourCroupier();

        // Determine the winner and update balances
        determinerGagnant();

        // Ask the player if they want to play again
        demanderNouvellePartie();
    }

    private void jouerTourJoueur() {
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            System.out.println("\nPlayer's Turn:");
            System.out.println("1. Hit");
            System.out.println("2. Stand");
    
            int choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    joueur.tirerCarte(paquet);
                    joueur.afficherMainEtSolde();
                    if (joueur.getMain().getValeurTotal() > 21) {
                        System.out.println("Busted! You went over 21.");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("You chose to stand. Your final hand:");
                    joueur.afficherMainEtSolde();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
    
            // If the player's hand is 17 or more, they automatically stand
            if (joueur.getMain().getValeurTotal() >= 17) {
                System.out.println("Your hand is 17 or more. You automatically stand.");
                break;
            }
        }
    }
    

    private void jouerTourCroupier() {
        System.out.println("\nCroupier's Turn:");
        croupier.revelerCarteCachee();
        croupier.afficherMainEtCarteCachee();

        // Croupier draws cards until reaching 17 or more
        while (croupier.getMain().getValeurTotal() < 17) {
            croupier.tirerCarteSupplementaire(paquet);
            croupier.afficherMain();
        }

        System.out.println("\nCroupier's Final Hand:");
        croupier.afficherMain();
    }

    private void determinerGagnant() {
        System.out.println("\nGame Result:");

        int valeurTotalJoueur = joueur.getMain().getValeurTotal();
        int valeurTotalCroupier = croupier.getMain().getValeurTotal();

        if (valeurTotalJoueur > 21) {
            System.out.println("Busted! You went over 21. You lose!");
            joueur.resultatPartie(1); // Player loses
        } else if (valeurTotalCroupier > 21) {
            System.out.println("Croupier busted! You win!");
            joueur.resultatPartie(0); // Player wins
        } else if (valeurTotalJoueur < valeurTotalCroupier) {
            System.out.println("Your hand is lower than the croupier's. You lose!");
            joueur.resultatPartie(1); // Player loses
        } else if (valeurTotalJoueur > valeurTotalCroupier) {
            System.out.println("Your hand is higher than the croupier's. You win!");
            joueur.resultatPartie(0); // Player wins
        } else {
            System.out.println("It's a tie! You get back your bet.");
            joueur.resultatPartie(-1); // It's a tie
        }
    }

    private void demanderNouvellePartie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDo you want to play again? (yes/no)");

        String response = scanner.next().toLowerCase();
        if (response.equals("yes")) {
            // Start a new game
            demarrerPartie();
        } else {
            System.out.println("Thank you for playing. Goodbye!");
        }
    }

    
}
