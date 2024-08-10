import java.util.List;


public interface ICRUDEleve {
    Eleve ajouter(Eleve eleve);
    Eleve modifier(Eleve eleve);
    void supprimer(int identifiant);
    List<Eleve> obtenirEleves();
    Eleve obtenir(int identifiant);
}
