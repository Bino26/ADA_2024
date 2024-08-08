public class Utilisateur {
    private int id;
    private String identifiant;
    private String motDePasse;

    public Utilisateur(int id, String identifiant, String motDePasse) {
        this.id = id;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public boolean authentication(String identifiant, String motDePasse) {
        return this.identifiant.equals(identifiant) && this.motDePasse.equals(motDePasse);
    }
}
