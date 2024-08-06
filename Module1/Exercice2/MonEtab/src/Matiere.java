public class Matiere {

    private final int id;
    private final String nom;

    private Matiere(int id , String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String AjouterMatiere(){
        return (" La matiere"+this.nom +" a bien ete ajoute");
    }



}
