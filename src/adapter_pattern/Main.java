package adapter_pattern;

public class Main {
	
    public static void main(String[] args) {
        // Création de l'instance de données internes
        InternalData internalData = new InternalData("Jean Dupont", 30);

        // Utilisation de l'adaptateur pour convertir les données
        DataAdapter adapter = new DataAdapter(internalData);

        // Conversion et envoi des données vers l'API externe
        ExternalAPI externalAPI = new ExternalAPI();
        externalAPI.sendData(adapter.convertToExternalFormat());
    }
}
