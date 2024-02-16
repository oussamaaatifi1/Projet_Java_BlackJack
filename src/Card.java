public class Card {
    private String type; // Suit of the card (carreau, coeur, pique, trèfle)
    private String value; // Value of the card (As, 2, 3, ..., King)

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Card(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public Card() {
        //TODO Auto-generated constructor stub
    }

    public static String TypeArr[] = {"carreau", "coeur", "pique", "trefle"};
    public static String ValueArr[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
}
