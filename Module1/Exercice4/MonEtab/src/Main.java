import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utilisateur utilisateur = new Utilisateur();


        System.out.println("******************************************************");
        System.out.println("BIENVENU DANS L’APPLICATION ETAB v1.3");
        System.out.println("******************************************************");
        System.out.print("CONNEXION\nIdentifiant : ");
        String username = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String password = scanner.nextLine();

        if (utilisateur.authentification(username, password)) {
            System.out.println("Connexion réussie!");

            int choice;
            do {
                displayMainMenu(scanner);
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> Eleve.displayEleveMenu(scanner);
                    case 2 -> Professeur.displayProfesseurMenu(scanner);
                    case 3 -> utilisateur.displayUtilisateurMenu(scanner);
                    case 0 -> System.out.println("Quitter l'application.");
                    default -> System.out.println("Option invalide. Veuillez réessayer.");
                }
            } while (choice != 0);
        } else {
            System.out.println("Échec de la connexion.");
        }
    }

    /**
     *
     * @param scanner
     */
    private static void displayMainMenu(Scanner scanner) {
        System.out.println("******************************************************\n" +
                "BIENVENU DANS L’APPLICATION ETAB v1.3\n" +
                "******************************************************\n" +
                "MENU:\n" +
                "1: Gestion des élèves\n" +
                "2: Gestion des professeurs\n" +
                "3: Gestion des utilisateurs\n" +
                "0: Quitter\n" +
                "Date système : 12:30\n");

    }
}
