import java.util.ArrayList;

public class Main
{
    public int valeurTotal;
    public String Nom;
    public int NbCartes;
    public ArrayList<Card> cards = new ArrayList<>();


    public Main(String Nom) {
        this.valeurTotal = 0;
        this.Nom = Nom;
        this.NbCartes = 0;
        this.cards = new ArrayList<>();
    }

    public int getValeurTotal() {
        return this.valeurTotal;
    }

    public void setValeurTotal(int valeurTotal) {
        this.valeurTotal = valeurTotal;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getNbCartes() {
        return this.NbCartes;
    }

    public void setNbCartes(int NbCartes) {
        this.NbCartes = NbCartes;
    }

    public ArrayList<Card> getcards() {
        return this.cards;
    }

    public void setCard(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public void ajouterCarte(Card card) {
        cards.add(card);
        // Optionally update nbCartes or valeurTotal based on the added card
        nbCartes++;
        // Perform any necessary calculations for valeurTotal
        // ...
    }

    public void calculerValeurTotale() {
        // Implement the logic to calculate the total value of cards in the hand
        // and update the valeurTotal field accordingly
        // ...
    }
}
