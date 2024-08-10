import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utilisateur utilisateur = new Utilisateur();

        if (utilisateur.authentification("admin", "admin")) {
            System.out.println("Connexion réussie!");
            int choice;
            do {
                displayMainMenu();
                choice = scanner.nextInt();
                scanner.nextLine();

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

    private static void displayMainMenu() {
        System.out.println("******************************************************");
        System.out.println("BIENVENU DANS L’APPLICATION ETAB v1.2");
        System.out.println("******************************************************");
        System.out.println("MENU:");
        System.out.println("1: Gestion des élèves");
        System.out.println("2: Gestion des professeurs");
        System.out.println("3: Gestion des utilisateurs");
        System.out.println("0: Quitter");
        System.out.println("******************************************************");
        System.out.print("Choisissez une option dans le menu: ");
    }
}
