import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (authentification()) {
            boolean quitter = false;
            while (!quitter) {
                afficherMenuPrincipal();
                int choix = scanner.nextInt();
                scanner.nextLine();

                switch (choix) {
                    case 1:
                        gestionEleves();
                        break;
                    case 2:
                        gestionProfesseurs();
                        break;
                    case 0:
                        quitter = true;
                        System.out.println("Au revoir! Merci d'avoir utilisé l'application.");
                        break;
                    default:
                        System.out.println("Choix invalide.");
                        break;
                }
            }
        } else {
            System.out.println("Identifiant ou mot de passe incorrect.");
        }
    }

    private static boolean authentification() {
        System.out.print("Identifiant: ");
        String identifiant = scanner.nextLine();
        System.out.print("Mot de passe: ");
        String motDePasse = scanner.nextLine();

        return identifiant.equals("admin") && motDePasse.equals("admin");
    }

    private static void afficherMenuPrincipal() {
        System.out.println("******************************************************\n" +
                "BIENVENU DANS L’APPLICATION ETAB v1.2\n" +
                "******************************************************\n" +
                "MENU:\n" +
                "1: Gestion des élèves\n" +
                "2: Gestion des professeurs\n" +
                "3: Gestion des utilisateurs\n" +
                "0: Quitter\n" +
                "\n" +
                "Date système : 12:30");
        System.out.print("Choisissez une option dans le menu: ");
    }

    private static void gestionEleves() {
        boolean retour = false;
        while (!retour) {
            System.out.println("******************************************************\n" +
                    "GESTION DES ELEVES\n" +
                    "******************************************************\n" +
                    "Menu :\n" +
                    "1: Ajouter un élève\n" +
                    "2: Supprimer un élève\n" +
                    "3: Modifier les informations de l'élève\n" +
                    "4: Lister les élèves\n" +
                    "5: Obtenir le dernier élève ajouté\n" +
                    "6: Retour\n" +
                    "0: Quitter\n");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom: ");
                    String prenom = scanner.nextLine();
                    System.out.print("Date de naissance (Ex: 23/12/1998): ");
                    String dateNaissance = scanner.nextLine();
                    System.out.print("Ville: ");
                    String ville = scanner.nextLine();
                    System.out.print("Classe: ");
                    String classe = scanner.nextLine();
                    Eleve eleve = new Eleve(1, nom, prenom, dateNaissance, ville, classe);
                    eleve.ajouter();
                    break;
                case 3:
                    System.out.println("Modifier les informations de l'élève - Fonctionnalité à implémenter.");
                    break;
                case 4:
                    Eleve.lister();
                    break;
                case 5:
                    Eleve dernierEleve = Eleve.obtenirDernierEleve();
                    if (dernierEleve != null) {
                        System.out.println(dernierEleve);
                    }
                    break;
                case 6:
                    retour = true;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }

    private static void gestionProfesseurs() {
        boolean retour = false;
        while (!retour) {
            System.out.println("******************************************************\n" +
                    "GESTION DES PROFESSEURS\n" +
                    "******************************************************\n" +
                    "Menu :\n" +
                    "1: Ajouter un professeur\n" +
                    "2: Supprimer un professeur\n" +
                    "3: Modifier les informations du professeur\n" +
                    "4: Lister les professeurs\n" +
                    "5: Obtenir le dernier professeur ajouté\n" +
                    "6: Retour\n" +
                    "0: Quitter\n");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom: ");
                    String prenom = scanner.nextLine();
                    System.out.print("Date de naissance (Ex: 23/12/1998): ");
                    String dateNaissance = scanner.nextLine();
                    System.out.print("Ville: ");
                    String ville = scanner.nextLine();
                    System.out.print("Vacant (true/false): ");
                    boolean vacant = scanner.nextBoolean();
                    Professeur professeur = new Professeur(1, nom, prenom, dateNaissance, ville, vacant);
                    professeur.ajouter();
                    break;
                case 3:
                    System.out.println("Modifier les informations du professeur - Fonctionnalité à implémenter.");
                    break;
                case 4:
                    Professeur.lister();
                    break;
                case 5:
                    Professeur dernierProfesseur = Professeur.obtenirDernierProfesseur();
                    if (dernierProfesseur != null) {
                        System.out.println(dernierProfesseur);
                    }
                    break;
                case 6:
                    retour = true;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }
}
