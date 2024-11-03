package adapter_pattern;

public class Main {
	
    public static void main(String[] args) {
    	 InternalData internalData = new InternalData("Mouna", 20);
         DataAdapter adapter = new DataAdapter(internalData);

         // Envoi des données converties vers l'API simulée
         adapter.sendToExternalAPI();
     }
}
