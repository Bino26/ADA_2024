import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quitter = false;
        while (!quitter) {
            afficherMenuPrincipal();
            int choix = scanner.nextInt();
            scanner.nextLine();

            quitter = switch (choix) {
                case 1 -> {
                    ajouterEtudiant();
                    yield false;
                }
                case 2 -> {
                    modifierEtudiant();
                    yield false;
                }
                case 3 -> {
                    gererNotes();
                    yield false;
                }
                case 4 -> {
                    System.out.println("Au revoir! Merci d'avoir utilisé l'application. Durée de la session : ...");
                    yield true;
                }
                default -> {
                    System.out.println("Choix invalide.");
                    yield false;
                }
            };
        }
    }

    private static void afficherMenuPrincipal() {
        System.out.println("******************************************************\n" +
                "BIENVENU DANS L’APPLICATION ETAB\n" +
                "******************************************************\n" +
                "MENU:\n" +
                "1: Ajouter un élève\n" +
                "2: Modifier les informations de l'élève\n" +
                "3: Gérer les notes\n" +
                "4: Quitter\n" +
                "\n" +
                "Date système : 12:30");
        System.out.print("Choisissez une option dans le menu: ");
    }

    private static void ajouterEtudiant() {
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Date de naissance (Ex: 23/12/1998): ");
        String dateNaissance = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Identifiant: ");
        int identifiant = scanner.nextInt();
        scanner.nextLine();

        Eleve eleve = new Eleve(identifiant, nom, prenom, dateNaissance, genre);
        System.out.println(eleve.ajouterEleve());
    }

    private static void modifierEtudiant() {
        System.out.println(
                "1: Modifier le nom\n" +
                        "2: Modifier le prénom\n" +
                        "3: Modifier la date de naissance (Ex: 23/12/1995)\n" +
                        "4: Modifier l'identifiant\n" +
                        "5: Retour\n" +
                        "6: Accueil\n" +
                        "\n" +
                        "Date système : 12:30");
        System.out.print("Choisissez une option: ");

    }

    private static void gererNotes() {
        System.out.println(
                "1: Ajouter une note\n" +
                        "2: Modifier une note\n" +
                        "3: Supprimer une note\n" +
                        "4: Afficher les notes\n" +
                        "5: Retour\n" +
                        "6: Accueil\n");
//        System.out.print("Choisissez une option: ");
//        int choix = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (choix) {
//            case 1 -> ajouterNote();
//            case 2 -> modifierNote();
//            case 3 -> supprimerNote();
//            case 4 -> afficherNotes();
//            case 5 -> {
//
//            }
//            case 6 -> {
//
//            }
//            default -> System.out.println("Choix invalide.");
//        }
    }

}
