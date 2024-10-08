import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Eleve extends Personne implements ICRUDEleve {
    private String classe;
    private String matricule;
    private static final List<Eleve> eleves = new ArrayList<>();

    public Eleve() {
        super();
    }

    public Eleve(int id, Date dateNaissance, String ville, String prenom,String nom, String telephone, String classe, String matricule) {
        super(id, dateNaissance ,ville, nom, prenom, telephone);
        this.classe = classe;
        this.matricule = matricule;
    }

    /**Diplasy : Eleve Menu
     *
     * @param scanner
     */

    public static void displayEleveMenu(Scanner scanner) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> ajouterEleve(scanner);
                case 2 -> supprimerEleve(scanner);
                case 3 -> modifierEleve(scanner);
                case 4 -> listerEleves();
                case 5 -> obtenirDernierEleve();
                case 6 -> System.out.println("Retour au menu principal.");
                case 0 -> System.out.println("Quitter l'application.");
                default -> System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choice != 6 && choice != 0);
    }

    private static void displayMenu() {
        System.out.println("******************************************************\n" +
                "GESTION DES ELEVES\n" +
                "******************************************************\n" +
                "Menu :\n" +
                " 1: Ajouter un élève\n" +
                " 2: Supprimer un élève\n" +
                " 3: Modifier les informations de l'élève\n" +
                " 4: Lister les élèves\n" +
                " 5: Retour\n" +
                " 0: Quitter");

    }

    @Override
    public Eleve ajouter(Eleve eleve) {
        eleves.add(eleve);
        return eleve;
    }

    @Override
    public void supprimer(int identifiant) {
        eleves.removeIf(eleve -> eleve.getId() == identifiant);
    }

    @Override
    public Eleve modifier(Eleve eleve) {
        for (Eleve e : eleves) {
            if (e.getId() == eleve.getId()) {
                e.setNom(eleve.getNom());
                e.setPrenom(eleve.getPrenom());
                e.setClasse(eleve.getClasse());
                e.setMatricule(eleve.getMatricule());
            }
        }
        return eleve;
    }

    @Override
    public List<Eleve> obtenirEleves() {
        return new ArrayList<>(eleves);
    }

    @Override
    public Eleve obtenir(int identifiant) {
        return eleves.stream()
                .filter(eleve -> eleve.getId() == identifiant)
                .findFirst()
                .orElse(null);
    }

    private static void ajouterEleve(Scanner scanner) {
        Eleve eleve = new Eleve();
        System.out.print("Nom: ");
        eleve.setNom(scanner.nextLine());
        System.out.print("Prénom: ");
        eleve.setPrenom(scanner.nextLine());
        System.out.print("Classe: ");
        eleve.setClasse(scanner.nextLine());
        System.out.print("Matricule: ");
        eleve.setMatricule(scanner.nextLine());

        eleve.ajouter(eleve);
        System.out.println("Élève ajouté avec succès.");
    }

    private static void supprimerEleve(Scanner scanner) {
        System.out.print("Entrez l'identifiant de l'élève à supprimer: ");
        int id = scanner.nextInt();
        new Eleve().supprimer(id);
        System.out.println("Élève supprimé avec succès.");
    }

    private static void modifierEleve(Scanner scanner) {
        System.out.print("Entrez l'identifiant de l'élève à modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Eleve eleve = new Eleve().obtenir(id);
        if (eleve != null) {
            System.out.print("Nouveau nom: ");
            eleve.setNom(scanner.nextLine());
            System.out.print("Nouveau prénom: ");
            eleve.setPrenom(scanner.nextLine());
            System.out.print("Nouvelle classe: ");
            eleve.setClasse(scanner.nextLine());
            System.out.print("Nouveau matricule: ");
            eleve.setMatricule(scanner.nextLine());

            new Eleve().modifier(eleve);
            System.out.println("Élève modifié avec succès.");
        } else {
            System.out.println("Élève non trouvé.");
        }
    }

    private static void listerEleves() {
        List<Eleve> eleves = new Eleve().obtenirEleves();
        if (eleves.isEmpty()) {
            System.out.println("Aucun élève trouvé.");
        } else {
            eleves.forEach(eleve -> System.out.println("Nom: " + eleve.getNom() + ", Prénom: " + eleve.getPrenom() + ", Classe: " + eleve.getClasse() + ", Matricule: " + eleve.getMatricule()));
        }
    }

    private static void obtenirDernierEleve() {
        List<Eleve> eleves = new Eleve().obtenirEleves();
        if (!eleves.isEmpty()) {
            Eleve dernier = eleves.get(eleves.size() - 1);
            System.out.println("Dernier élève ajouté: Nom: " + dernier.getNom() + ", Prénom: " + dernier.getPrenom() + ", Classe: " + dernier.getClasse() + ", Matricule: " + dernier.getMatricule());
        } else {
            System.out.println("Aucun élève ajouté.");
        }
    }


    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
