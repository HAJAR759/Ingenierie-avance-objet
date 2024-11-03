package adapter_pattern;

import java.util.HashMap;
import java.util.Map;

public class DataAdapter {
    private InternalData internalData;

    public DataAdapter(InternalData internalData) {
        this.internalData = internalData;
    }

    public Map<String, Object> convertToExternalFormat() {
        Map<String, Object> externalData = new HashMap<>();
        // Conversion des données dans le format attendu par l'API externe
        externalData.put("name", internalData.getFullName());
        externalData.put("age", internalData.getYearsOld());
        return externalData;
    }
}
