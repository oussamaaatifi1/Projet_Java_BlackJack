import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of Joueur, Croupier, and PaquetCartes
        Joueur joueur = new Joueur("Player1", 500, new ArrayList<>());
        Croupier croupier = new Croupier(new ArrayList<>(), 17);
        PaquetCartes paquet = new PaquetCartes(new ArrayList<>(), 52);

        // Create an instance of BlackJack
        BlackJack jeu = new BlackJack(joueur, croupier, paquet);

        boolean exitGame = false;

        while (!exitGame) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Start a new game");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    jeu.demarrerPartie();
                    break;
                case 2:
                    joueur.afficherMainEtSolde();
                    break;
                case 3:
                    System.out.println("Exiting the game. Goodbye!");
                    exitGame = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
