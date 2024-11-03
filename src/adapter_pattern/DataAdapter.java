package adapter_pattern;


import java.util.HashMap;
import java.util.Map;


public class DataAdapter {
    
    private InternalData internalData;

    public DataAdapter(InternalData internalData) {
        this.internalData = internalData;
    }

    // Conversion vers le format attendu par l'API externe
    public Map<String, Object> convertToExternalFormat() {
        Map<String, Object> externalData = new HashMap<>();
        externalData.put("name", internalData.getFullName());
        externalData.put("age", internalData.getYearsOld());
        return externalData;
    }
    
 // Méthode pour convertir en JSON 
    public String convertToJson() {
        return "{ \"name\": \"" + internalData.getFullName() + "\", \"age\": " + internalData.getYearsOld() + " }";
    }

    // Méthode pour convertir en XML 
    public String convertToXml() {
        return "<InternalData>\n" +
               "   <name>" + internalData.getFullName() + "</name>\n" +
               "   <age>" + internalData.getYearsOld() + "</age>\n" +
               "</InternalData>";
    }
    
    // Méthode de test de l'adaptateur
    public void sendToExternalAPI() {
        Map<String, Object> data = convertToExternalFormat();
        System.out.println("Données envoyées à l'API externe (format Map) : " + data);
        System.out.println("Données envoyées à l'API externe (format JSON) : " + convertToJson());
        System.out.println("Données envoyées à l'API externe (format XML) : " + convertToXml());
    }
    
   
    
}
