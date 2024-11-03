package databasecnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
    // Instance unique de la classe
    private static DatabaseConnection instance;
    private Connection connection;
    private long creationTime;

   
    private static final String URL = "jdbc:mysql://localhost:3306/singleton_db";
    private static final String USER = "user";
    private static final String PASSWORD = "user";

    // Constructeur privé pour empêcher l'instanciation directe
    private DatabaseConnection() {
        try {
            // Mesure du temps de création de la connexion
            long startTime = System.currentTimeMillis();
            
            // Création de la connexion
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Stockage du temps de création
            this.creationTime = System.currentTimeMillis() - startTime;
            System.out.println("Connexion créée en " + this.creationTime + " ms");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode statique pour obtenir l'instance unique
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            System.out.println("Création d'une nouvelle instance de DatabaseConnection.");
            instance = new DatabaseConnection();
        } else {
            System.out.println("Utilisation de l'instance existante.");
        }
        return instance;
    }

    // Méthode pour exécuter des requêtes simples
    public void executeQuery(String query) {
        System.out.println("Exécution de la requête : " + query);
        
    }

    // Getter pour le temps de création de la connexion
    public long getCreationTime() {
        return this.creationTime;
    }

    // Exemple de méthode pour obtenir la connexion
    public Connection getConnection() {
        return this.connection;
    }

}
