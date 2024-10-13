package exercice6;

public class ValidationAge {
    public boolean peutBoireAlcool(int age, String region) {
        if (region.equals("Region1")) {
            return age >= 18;
        } else if (region.equals("Region2")) {
            return age >= 14;
        } else if (region.equals("Region3")) {
            return age >= 19;
        }
        return false;
    }
    public boolean peutUtiliserFesseBouk(int age, String region) {
        if (region.equals("Region1")) {
            return age >= 13;
        } else if (region.equals("Region2")) {
            return age >= 15;
        } else if (region.equals("Region3")) {
            return age >= 14;
        }
        return false;
    }
    public boolean peutEtreEluMaire(int age, String region) {
        if (region.equals("Region1")) {
            return age >= 21;
        } else if (region.equals("Region2")) {
            return age >= 19;
        } else if (region.equals("Region3")) {
            return age >= 21;
        }
        return false;
    }
}
