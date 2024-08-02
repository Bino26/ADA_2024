public class Main {
    public static void main(String[] args) {
        Eleve junior = new Eleve(1,"Bino","Bino",24,"M");
        // Ajouter un eleve

       var eleve = junior.AjouterEleve();
       System.out.println(eleve);

       Note note1 = new Note(1,"Math",junior);
       System.out.println(note1.AjouterNote());
    }


}
