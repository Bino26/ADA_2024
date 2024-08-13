package models;

import dao.SingletonDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utilisateur {
    private int id;
    private String pseudo;
    private String motDePass;

    public Utilisateur() {
    }

    public Utilisateur(int id, String pseudo, String motDePass) {
        this.id = id;
        this.pseudo = pseudo;
        this.motDePass = motDePass;
    }

    public void ajouterUtilisateurDefaut() {

        try {
            String QUERY_INSERT_USER_BY_PSEUDO_AND_MOTDEPASS = "INSERT INTO Utilisateur (id, pseudo, motDePasse, dateCreation) VALUES (?, ?, ?, CURDATE())";
            PreparedStatement statement = SingletonDataBase.getInstance().prepareStatement(QUERY_INSERT_USER_BY_PSEUDO_AND_MOTDEPASS);
            statement.setString(1, "1");
            statement.setString(2, "admin");
            statement.setString(3, "admin");
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Getters and setters can be added if needed

    public int getId() {
        return id;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public String getIdentifiant() {
        return pseudo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentifiant(String identifiant) {
        this.pseudo = identifiant;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    @Override
    public String toString() {
        return "models.Utilisateur{" +
                "id=" + id +
                ", identifiant='" + pseudo + '\'' +
                ", motDePass='" + motDePass + '\'' +
                '}';
    }
}