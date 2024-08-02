public class Main {
    public static void main(String[] args) {


        System.out.println("******************************************************\n" +
                "\n" +
                "BIENVENU DANS L’APPLICATION ETAB\n" +
                "\n" +
                "******************************************************\n" +
                "\n" +
                "MENU:\n" +
                "\n" +
                "1: Ajouter un élève\n" +
                "2: Supprimer un élève\n" +
                "3: Modifier les informations de l'élève\n" +
                "4: Lister les élèves\n" +
                "5: Gérer les notes\n" +
                "\n" +
                "Date système : 12:30");

        Eleve junior = new Eleve(1,"Bino","Bino",24,"M");
        // Ajouter un eleve

       var eleve = junior.AjouterEleve();
       System.out.println(eleve);

       Note note1 = new Note(1,"Math",junior);
       System.out.println(note1.AjouterNote());
    }


}
