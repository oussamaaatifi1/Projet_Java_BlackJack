public class Personne
{
    public String Nom;
    public Main main;


    public Main getMain() {
        return this.main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Personne(String Nom) {
        this.Nom = Nom;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
}
