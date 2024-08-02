public class Eleve {

    private final int id;
    private final String nom;
    private final String prenom;
    private final String genre;

    public Eleve(int id , String nom , String prenom , int age , String genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
    }

    public String AjouterEleve(){
        return ("Nouveau eleve:\n" + "Id:\t"+ this.id+ "Nom :\t"+ this.nom + "Prenom\t:"+this.prenom+ "Genre\t:"+this.genre);
    }


}
