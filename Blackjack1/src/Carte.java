public class Carte {
    protected String couleur;
    protected String valeur;

    public static final String[] TypeArr = {"carreau", "coeur", "pique", "trefle"};
    public static final String[] ValueArr = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Carte(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
}
