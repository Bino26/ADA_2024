import java.util.Date;

public abstract class Personne {
    protected int id;
    protected Date dateNaissance;
    protected String ville;
    protected String prenom;
    protected String nom;
    protected String telephone;

    public Personne() {
    }

    public Personne(int id, Date dateNaissance, String ville, String prenom, String nom, String telephone) {
        this.id = id;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
    }

    public int obtenirAge(Date currentDate) {
        // Assume a simple calculation of age based on year difference
        int currentYear = currentDate.getYear();
        int birthYear = dateNaissance.getYear();
        return currentYear - birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
