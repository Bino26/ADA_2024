public abstract class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String ville;

    public Personne(int id, String nom, String prenom, String dateNaissance, String ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int obtenirAge() {

        return 0;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom;
    }
}
