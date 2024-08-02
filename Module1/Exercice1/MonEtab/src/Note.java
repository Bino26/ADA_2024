public class Note {

    private final int id;
    private final String valeur;
    private final Eleve eleve;


    public Note(int id , String valeur , Eleve eleve) {
        this.id = id;
        this.valeur = valeur;
        this.eleve = eleve;

    }

    public String AjouterNote(){
        return ("Note de \n"+ this.eleve + "Valeur:\n"+this.valeur + "Note\n:"
        );
    }
}
