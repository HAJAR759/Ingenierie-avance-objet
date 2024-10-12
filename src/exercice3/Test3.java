package exercice3;

public class Test3 {
    public static void main(String[] args) {
        // Création de la matrice de Young
        MatriceYoung youngMatrix = new MatriceYoung(3, 3);
        OperationMatriceYoung operations = new OperationMatriceYoung(3, 3);

        // Insertion de quelques éléments
        operations.add(1);
        operations.add(2);
        operations.add(3);
        operations.add(4);
        operations.add(5);
        operations.add(6);
        operations.add(7);
        operations.add(8);
        operations.add(9); // Pour voir comment la matrice se comporte avec un tableau plein.

        // Affichage du tableau après insertion
        System.out.println("Tableau après insertion :");
        youngMatrix.printTabbleau();

        // Extraction du minimum
        int min = operations.extraireMin();
        System.out.println("Minimum extrait : " + min);

        // Affichage du tableau après extraction
        System.out.println("Tableau après extraction :");
        youngMatrix.printTabbleau();
    }
}
