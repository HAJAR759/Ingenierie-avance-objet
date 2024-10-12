package exercice3;

public class Test3 {
<<<<<<< HEAD
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
=======

    public static void main(String[] args) {
        OperationMatriceYoung matrice = new OperationMatriceYoung(4, 4); // Crée un tableau de Young de 4x4
>>>>>>> 67fc6683af8f46a31dc9b9b212e5f404dcfa3bf1

        System.out.println("État initial du tableau de Young:");
        matrice.printTableau();

<<<<<<< HEAD
        // Extraction du minimum
        int min = operations.extraireMin();
        System.out.println("Minimum extrait : " + min);
=======
        matrice.add(10);
        System.out.println("Insertion de l'élément 10:");
        matrice.printTableau();
>>>>>>> 67fc6683af8f46a31dc9b9b212e5f404dcfa3bf1

        matrice.add(7);
        System.out.println("Insertion de l'élément 7:");
        matrice.printTableau();

        matrice.add(15);
        System.out.println("Insertion de l'élément 15:");
        matrice.printTableau();

        matrice.add(2);
        System.out.println("Insertion de l'élément 2:");
        matrice.printTableau();

        matrice.add(5);
        System.out.println("Insertion de l'élément 5:");
        matrice.printTableau();

        System.out.println("Extraction du minimum:");
        int min1 = matrice.extraireMin();
        System.out.println("Valeur extraite: " + min1);
        matrice.printTableau();

        System.out.println("Extraction du minimum:");
        int min2 = matrice.extraireMin();
        System.out.println("Valeur extraite: " + min2);
        matrice.printTableau();

        matrice.add(12);
        System.out.println("Insertion de l'élément 12:");
        matrice.printTableau();

        matrice.add(1);
        System.out.println("Insertion de l'élément 1:");
        matrice.printTableau();

        System.out.println("Extraction du minimum:");
        int min3 = matrice.extraireMin();
        System.out.println("Valeur extraite: " + min3);
        matrice.printTableau();

        System.out.println("Extraction du minimum:");
        int min4 = matrice.extraireMin();
        System.out.println("Valeur extraite: " + min4);
        matrice.printTableau();
    }
}
