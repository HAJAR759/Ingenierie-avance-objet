package exercice3;

public class Test3 {

    public static void main(String[] args) {
        OperationMatriceYoung matrice = new OperationMatriceYoung(4, 4); // Crée un tableau de Young de 4x4

        System.out.println("État initial du tableau de Young:");
        matrice.printTableau();

        matrice.add(10);
        System.out.println("Insertion de l'élément 10:");
        matrice.printTableau();

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