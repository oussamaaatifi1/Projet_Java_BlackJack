import java.util.ArrayList;
import java.util.Random;

public class PackCard {
    ArrayList<Card> card = new ArrayList<Card>();

    public void afficherDetails(String type, String value) {
        System.out.println("Card: " + type + " of " + value);
    }

    public static Card[] createDeck() {
        Card[] deck = new Card[52];

        int index = 0;
        String[] TypeArr = {"carreau", "coeur", "pique", "trèfle"};
        String[] ValueArr = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < TypeArr.length; i++) {
            for (int j = 0; j < ValueArr.length; j++) {
                deck[index] = new Card(TypeArr[i], ValueArr[j]); // Assuming you have a Card class
                index++;
            }
        }

        return deck;
    }

    public static void shuffleDeck(Card[] deck) {
        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap deck[i] and deck[j]
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
}
