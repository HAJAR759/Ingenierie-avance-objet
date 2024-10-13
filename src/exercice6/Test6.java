package exercice6;

public class Test6 {
	
	    	public static void main(String[] args) {
	            ValidationAge validationRegion1 = new ValidationAge(new ValidationAgeRegion1());
	            ValidationAge validationRegion2 = new ValidationAge(new RegleValidationRegion2());

	            System.out.println("Boire alcool, Region1, age 18: " + validationRegion1.peutBoireAlcool(18));  // true
	            System.out.println("Boire alcool, Region2, age 14: " + validationRegion2.peutBoireAlcool(14));  // true
	        
	    }
	}
