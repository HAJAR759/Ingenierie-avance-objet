package exercice4;

public class Test4 {

	 public static void main(String[] args) {
	        Enseignent enseignant = new Enseignent("John", "Doe", "Professeur");
	        CompteUniversitaire compteEnseignant = new CompteUniversitaire(enseignant);
	        System.out.println("Login Enseignant: " + compteEnseignant.getLogin());

	        Etudiant etudiant = new Etudiant("Jane", "Smith");
	        CompteUniversitaire compteEtudiant = new CompteUniversitaire(etudiant);
	        System.out.println("Login Étudiant: " + compteEtudiant.getLogin());
	        
	       
	    }

}
