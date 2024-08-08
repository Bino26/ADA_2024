import java.util.ArrayList;
import java.util.List;

public class Professeur extends Personne {
    private boolean vacant;
    private static List<Professeur> professeurs = new ArrayList<>();

    public Professeur(int id, String nom, String prenom, String dateNaissance, String ville, boolean vacant) {
        super(id, nom, prenom, dateNaissance, ville);
        this.vacant = vacant;
    }

    public void ajouter() {
        professeurs.add(this);
        System.out.println("Professeur ajouté : " + this);
    }

    public void mettreAJour(int id, String nom, String prenom, String dateNaissance, String ville, boolean vacant) {
        for (Professeur professeur : professeurs) {
            if (professeur.getId() == id) {
                professeur.setNom(nom);
                professeur.setPrenom(prenom);
                professeur.setDateNaissance(dateNaissance);
                professeur.setVille(ville);
                professeur.setVacant(vacant);
                System.out.println("Professeur mis à jour : " + professeur);
                return;
            }
        }
        System.out.println("Professeur non trouvé.");
    }

    public static void lister() {
        if (professeurs.isEmpty()) {
            System.out.println("Aucun professeur n'a été ajouté.");
        } else {
            for (Professeur professeur : professeurs) {
                System.out.println(professeur);
            }
        }
    }

    public static Professeur obtenirDernierProfesseur() {
        if (professeurs.isEmpty()) {
            System.out.println("Aucun professeur n'a été ajouté.");
            return null;
        }
        return professeurs.get(professeurs.size() - 1);
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Nom: " + getNom() + ", Prénom: " + getPrenom() + ", Vacant: " + (vacant ? "Oui" : "Non");
    }

    // Getters and Setters
    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }
}
