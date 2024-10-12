package exercice3;

public class Test3 {
	public static void main(String[] args) {
        // Création de la matrice de Young
		MatriceYoung youngMatrix = new MatriceYoung(3, 3);
		OperationMatriceYoung operations = new OperationMatriceYoung(youngMatrix, 3, 3);

        // Insertion de quelques éléments
        operations.insertElement(10);
        operations.insertElement(5);
        operations.insertElement(20);
        operations.insertElement(3);

        // Affichage du tableau après insertion
        System.out.println("Tableau après insertion :");
        youngMatrix.printTabbleau();

        // Extraction du minimum
        int min = operations.extractMin();
        System.out.println("Minimum extrait : " + min);

        // Affichage du tableau après extraction
        System.out.println("Tableau après extraction :");
        youngMatrix.printTabbleau();
    }
}
