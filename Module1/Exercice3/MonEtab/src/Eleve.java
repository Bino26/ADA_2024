import java.util.ArrayList;
import java.util.List;

public class Eleve extends Personne {
    private String classe;
    private static List<Eleve> eleves = new ArrayList<>();

    public Eleve(int id, String nom, String prenom, String dateNaissance, String ville, String classe) {
        super(id, nom, prenom, dateNaissance, ville);
        this.classe = classe;
    }

    public void ajouter() {
        eleves.add(this);
        System.out.println("Élève ajouté : " + this);
    }

    public void mettreAJour(int id, String nom, String prenom, String dateNaissance, String ville, String classe) {
        for (Eleve eleve : eleves) {
            if (eleve.getId() == id) {
                eleve.setNom(nom);
                eleve.setPrenom(prenom);
                eleve.setDateNaissance(dateNaissance);
                eleve.setVille(ville);
                eleve.setClasse(classe);
                System.out.println("Élève mis à jour : " + eleve);
                return;
            }
        }
        System.out.println("Élève non trouvé.");
    }

    public static void lister() {
        if (eleves.isEmpty()) {
            System.out.println("Aucun élève n'a été ajouté.");
        } else {
            for (Eleve eleve : eleves) {
                System.out.println(eleve);
            }
        }
    }

    public static Eleve obtenirDernierEleve() {
        if (eleves.isEmpty()) {
            System.out.println("Aucun élève n'a été ajouté.");
            return null;
        }
        return eleves.get(eleves.size() - 1);
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Nom: " + getNom() + ", Prénom: " + getPrenom() + ", Classe: " + classe;
    }

    // Getters and Setters
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
