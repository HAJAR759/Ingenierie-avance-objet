package exercice6;

public class Test6 {
	
	    public static void main(String[] args) {
	        ValidationAge validator = new ValidationAge();
	        
	        System.out.println("Boire alcool, Region1, age 18: " + validator.peutBoireAlcool(18, "Region1"));  // true
	        System.out.println("Boire alcool, Region2, age 14: " + validator.peutBoireAlcool(14, "Region2"));  // true
	        System.out.println("Boire alcool, Region3, age 19: " + validator.peutBoireAlcool(19, "Region3"));  // true
	        
	        System.out.println("Utiliser FesseBouk, Region1, age 13: " + validator.peutUtiliserFesseBouk(13, "Region1"));  // true
	        System.out.println("Utiliser FesseBouk, Region2, age 15: " + validator.peutUtiliserFesseBouk(15, "Region2"));  // true
	        System.out.println("Etre Elu Maire, Region1, age 21: " + validator.peutEtreEluMaire(21, "Region1"));  // true
	    }
	}
