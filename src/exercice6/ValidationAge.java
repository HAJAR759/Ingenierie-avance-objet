package exercice6;

public class ValidationAge {
    private RegleValidationAge regle;

    public ValidationAge(RegleValidationAge regle) {
        this.regle = regle;
    }

    public boolean peutBoireAlcool(int age) {
        return regle.peutBoireAlcool(age);
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return regle.peutUtiliserFesseBouk(age);
    }

    public boolean peutEtreEluMaire(int age) {
        return regle.peutEtreEluMaire(age);
    }
}
