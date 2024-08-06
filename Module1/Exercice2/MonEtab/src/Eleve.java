public class Eleve {

    private final int id;
    private final String nom;
    private final String prenom;
    private final  String age;
    private final String genre;

    public Eleve(int id , String nom , String prenom , String age , String genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.genre = genre;
    }


    public String ajouterEleve(){


        return String.format("Nouveau élève:\nId:\t%d\nNom:\t%s\nPrénom:\t%s\nDate de naissance:\t%s\nGenre:\t%s",id, nom, prenom, age, genre);
    }


}
