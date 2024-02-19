import java.util.Collections;
import java.util.List;

public class PaquetCartes {
    protected List<Carte> listCartes;
    protected int size;

    public PaquetCartes(List<Carte> listCartes, int size) {
        this.listCartes = listCartes;
        this.size = size;
    }

    public void initialiserPaquet() {
        for (String couleur : Carte.TypeArr) {
            for (String valeur : Carte.ValueArr) {
                Carte carte = new Carte(couleur, valeur);
                listCartes.add(carte);
            }
        }
    }

    public void melangerCartes() {
        Collections.shuffle(listCartes);
    }
}
