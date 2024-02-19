import java.util.List;

public class Hand {
    int valeurTotal;
    private String nom;
    List<Carte> listCartes;

    public Hand(String nom, List<Carte> listCartes) {
        this.valeurTotal = 0;
        this.nom = nom;
        this.listCartes = listCartes;
        calculerValeurTotale();
    }

    public void ajouterCarte(Carte carte) {
        listCartes.add(carte);
        calculerValeurTotale();
    }

    public void calculerValeurTotale() {
        valeurTotal = 0;
        int nbAs = 0;

        for (Carte carte : listCartes) {
            String valeur = carte.valeur;

            if (valeur.equals("As")) {
                nbAs++;
                valeurTotal += 11; // Assuming Ace is initially worth 11 points
            } else if (valeur.equals("Jack") || valeur.equals("Queen") || valeur.equals("King")) {
                valeurTotal += 10;
            } else {
                valeurTotal += Integer.parseInt(valeur);
            }
        }

        // Adjust for Aces if needed
        while (nbAs > 0 && valeurTotal > 21) {
            valeurTotal -= 10;
            nbAs--;
        }
    }

    public void afficherMain() {
        System.out.println(nom + " 's Hand: **\n");
        for (Carte carte : listCartes) {
            System.out.println("* Couleur * : " + carte.couleur + ", * Valeur * : " + carte.valeur);
        }
        System.out.println("- _ - Total Value  - _ - :" + valeurTotal);
    }

    public int getValeurTotal() {
        return valeurTotal;
    }

    public List<Carte> getListCartes() {
        return listCartes;
    }

    public void setListCartes(List<Carte> cartes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setListCartes'");
    }
}
