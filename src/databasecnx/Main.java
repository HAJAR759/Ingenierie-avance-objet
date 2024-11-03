package databasecnx;



public class Main {

    public static void main(String[] args) {
        // Tentative de création de plusieurs instances
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println("Temps de création de la première instance : " + db1.getCreationTime() + " ms");

        // Exécution d'une requête
        db1.executeQuery("SELECT * FROM users");

        // Nouvelle tentative de création de connexion
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Temps de création de la deuxième instance : " + db2.getCreationTime() + " ms");

        // Vérification que les instances sont identiques
        System.out.println("Les instances sont-elles identiques ? " + (db1 == db2));
    }

}
