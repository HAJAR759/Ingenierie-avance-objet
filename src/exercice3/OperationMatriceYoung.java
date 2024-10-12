package exercice3;


public class OperationMatriceYoung extends MatriceYoung {

    public OperationMatriceYoung(int n, int m) {
        super(n, m);
    }

    public int extraireMin() {
        if (getElement(0, 0) == INF) {
            System.out.println("Le tableau est vide.");
            return INF; // Aucun élément à extraire
        }

        // Extraire le minimum
        int min = getElement(0, 0);
        setElement(0, 0, INF); // Remplacer le minimum par INF

        // Rééquilibrer le tableau après extraction
        equilibrerTableau(0, 0);

        return min; // Retourner la valeur du minimum extrait
    }


    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? getElement(i + 1, j) : INF;
        int right = (j + 1 < m) ? getElement(i, j + 1) : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            setElement(i, j, down);
            setElement(i + 1, j, INF); // Remplacer la position descendue par INF
            equilibrerTableau(i + 1, j);
        } else {
            setElement(i, j, right);
            setElement(i, j + 1, INF); // Remplacer la position déplacée par INF
            equilibrerTableau(i, j + 1);
        }
    }

    public boolean add(int key) {
        // Chercher la première case disponible pour l'insertion
        int i = n - 1, j = m - 1;

        while (i >= 0 && j >= 0) {
            if (getElement(i, j) == INF) {
                setElement(i, j, key); // Insérer la clé
                remonter(i, j); // Maintenir la propriété du tableau de Young
                return true;
            } else if (i > 0 && getElement(i - 1, j) <= key) {
                j--; // Aller à gauche
            } else {
                i--; // Aller vers le haut
            }
        }

        System.out.println("Le tableau de Young est plein.");
        return false;
    }

    private void remonter(int i, int j) {
        int key = getElement(i, j);
        while (i > 0 || j > 0) {
            int up = (i > 0) ? getElement(i - 1, j) : INF;
            int left = (j > 0) ? getElement(i, j - 1) : INF;

            if (key < up && key < left) {
                break; // La clé est à la bonne place
            } else if (up < left) {
                setElement(i, j, up);
                i--;
            } else {
                setElement(i, j, left);
                j--;
            }
        }
        setElement(i, j, key); // Placer la clé à la bonne position
    }

    // Méthode d'affichage du tableau
    public void printTableau() {
        super.printTableau();
        System.out.println(); // Ligne vide pour l'espacement
    }
}
