import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Professeur extends Personne implements IEducation, ICRUDProfesseur {
    private boolean vacant;
    private String matiereEnseigne;
    private String prochainCours;
    private String sujetProchaineReunion;
    private static final List<Professeur> professeurs = new ArrayList<>();

    public Professeur() {
        super();
    }

    public Professeur(int id, Date dateNaissance, String ville, String prenom, String nom, String telephone, boolean vacant, String matiereEnseigne, String prochainCours, String sujetProchaineReunion) {
        super(id, dateNaissance ,ville, nom, prenom, telephone);
        this.vacant = vacant;
        this.matiereEnseigne = matiereEnseigne;
        this.prochainCours = prochainCours;
        this.sujetProchaineReunion = sujetProchaineReunion;
    }

    public static void displayProfesseurMenu(Scanner scanner) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> ajouterProfesseur(scanner);
                case 2 -> supprimerProfesseur(scanner);
                case 3 -> modifierProfesseur(scanner);
                case 4 -> listerProfesseurs();
                case 5 -> obtenirDernierProfesseur();
                case 6 -> System.out.println("Retour au menu principal.");
                case 0 -> System.out.println("Quitter l'application.");
                default -> System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choice != 6 && choice != 0);
    }

    private static void displayMenu() {
        System.out.println("******************************************************");
        System.out.println("GESTION DES PROFESSEURS");
        System.out.println("******************************************************");
        System.out.println("Menu :");
        System.out.println("1: Ajouter un professeur");
        System.out.println("2: Supprimer un professeur");
        System.out.println("3: Modifier les informations du professeur");
        System.out.println("4: Lister les professeurs");
        System.out.println("5: Obtenir le dernier professeur ajouté");
        System.out.println("6: Retour");
        System.out.println("0: Quitter");
        System.out.println("******************************************************");
        System.out.print("Choisissez une option: ");
    }

    @Override
    public Professeur ajouter(Professeur professeur) {
        professeurs.add(professeur);
        return professeur;
    }

    @Override
    public void supprimer(int identifiant) {
        professeurs.removeIf(professeur -> professeur.getId() == identifiant);
    }

    @Override
    public Professeur modifier(Professeur professeur) {
        for (Professeur p : professeurs) {
            if (p.getId() == professeur.getId()) {
                p.setNom(professeur.getNom());
                p.setPrenom(professeur.getPrenom());

            }
        }
        return professeur;
    }

    @Override
    public List<Professeur> obtenirProfesseurs() {
        return new ArrayList<>(professeurs);
    }

    @Override
    public Professeur obtenir(int identifiant) {
        return professeurs.stream()
                .filter(professeur -> professeur.getId() == identifiant)
                .findFirst()
                .orElse(null);
    }

    @Override
    public String enseigner(String matiere) {
        return "Enseigne la matière " + matiere;
    }

    @Override
    public String preparerCours(String cours) {
        return "Prépare le contenu d'un cours sur le sujet " + cours;
    }

    @Override
    public String assisterReunion(String sujet) {
        return "";
    }

    private static void ajouterProfesseur(Scanner scanner) {
        Professeur professeur = new Professeur();
        System.out.print("Nom: ");
        professeur.setNom(scanner.nextLine());
        System.out.print("Prénom: ");
        professeur.setPrenom(scanner.nextLine());
        professeur.ajouter(professeur);
        System.out.println("Professeur ajouté avec succès.");
    }

    private static void supprimerProfesseur(Scanner scanner) {
        System.out.print("Entrez l'identifiant du professeur à supprimer: ");
        int id = scanner.nextInt();
        new Professeur().supprimer(id);
        System.out.println("Professeur supprimé avec succès.");
    }

    private static void modifierProfesseur(Scanner scanner) {
        System.out.print("Entrez l'identifiant du professeur à modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Professeur professeur = new Professeur().obtenir(id);
        if (professeur != null) {
            System.out.print("Nouveau nom: ");
            professeur.setNom(scanner.nextLine());
            System.out.print("Nouveau prénom: ");
            professeur.setPrenom(scanner.nextLine());
            new Professeur().modifier(professeur);
            System.out.println("Professeur modifié avec succès.");
        } else {
            System.out.println("Professeur non trouvé.");
        }
    }

    private static void listerProfesseurs() {
        List<Professeur> professeurs = new Professeur().obtenirProfesseurs();
        if (professeurs.isEmpty()) {
            System.out.println("Aucun professeur trouvé.");
        } else {
            professeurs.forEach(professeur -> System.out.println("Nom: " + professeur.getNom() + ", Prénom: " + professeur.getPrenom()));
        }
    }

    private static void obtenirDernierProfesseur() {
        List<Professeur> professeurs = new Professeur().obtenirProfesseurs();
        if (!professeurs.isEmpty()) {
            Professeur dernier = professeurs.get(professeurs.size() - 1);
            System.out.println("Dernier professeur ajouté: Nom: " + dernier.getNom() + ", Prénom: " + dernier.getPrenom());
        } else {
            System.out.println("Aucun professeur ajouté.");
        }
    }
}
