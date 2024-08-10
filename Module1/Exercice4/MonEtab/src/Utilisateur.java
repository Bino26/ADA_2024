import java.util.Scanner;

public class Utilisateur {

    public boolean authentification(String username, String password) {

        return "admin".equals(username) && "admin".equals(password);
    }

    public void displayUtilisateurMenu(Scanner scanner) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> ajouterUtilisateur(scanner);
                case 2 -> supprimerUtilisateur(scanner);
                case 3 -> modifierUtilisateur(scanner);
                case 4 -> listerUtilisateurs();
                case 5 -> System.out.println("Retour au menu principal.");
                case 0 -> System.out.println("Quitter l'application.");
                default -> System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choice != 5 && choice != 0);
    }

    private void displayMenu() {
        System.out.println("******************************************************");
        System.out.println("GESTION DES UTILISATEURS");
        System.out.println("******************************************************");
        System.out.println("Menu :");
        System.out.println("1: Ajouter un utilisateur");
        System.out.println("2: Supprimer un utilisateur");
        System.out.println("3: Modifier les informations d'un utilisateur");
        System.out.println("4: Lister les utilisateurs");
        System.out.println("5: Retour");
        System.out.println("0: Quitter");
        System.out.println("******************************************************");
        System.out.print("Choisissez une option: ");
    }

    private void ajouterUtilisateur(Scanner scanner) {

        System.out.println("Utilisateur ajouté.");
    }

    private void supprimerUtilisateur(Scanner scanner) {

        System.out.println("Utilisateur supprimé.");
    }

    private void modifierUtilisateur(Scanner scanner) {

        System.out.println("Utilisateur modifié.");
    }

    private void listerUtilisateurs() {

        System.out.println("Liste des utilisateurs.");
    }
}
