package databasecnx;



public class Main {

    public static void main(String[] args) {
        // Tentative de création de plusieurs instances
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        System.out.println("Temps de création de la première instance : " + db1.getCreationTime() + " ms");
        System.out.println("Temps de création de la deuxième instance : " + db2.getCreationTime() + " ms");

        
        db1.executeQuery("SELECT * FROM users");
        db2.executeQuery("INSERT INTO users VALUES ('mouna','hajar')");

        
        // Vérification que les instances sont identiques
        System.out.println("Les instances sont-elles identiques ? " + (db1 == db2));
    }

}
