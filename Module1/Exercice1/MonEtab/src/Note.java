public class Note {

    private final int id;
    private final String valeur;
    private final Eleve eleve;
    private final int note;


    public Note(int id , String valeur , Eleve eleve ,int note) {
        this.id = id;
        this.valeur = valeur;
        this.eleve = eleve;

        this.note = note;
    }

}
