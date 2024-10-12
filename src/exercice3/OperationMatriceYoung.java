package exercice3;

public class OperationMatriceYoung extends MatriceYoung {

    public OperationMatriceYoung(int n, int m) {
        super(n, m);
    }

    public boolean add(int key) {
        if (getElement(n - 1, m - 1) != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }
        // Insérer la clé dans la dernière position (case en bas à droite)
        this.setElement(n - 1, m - 1, key);
        // Maintenir la propriété du tableau de Young
        equilibrerTableau(n - 1, m - 1);
        return true;
    }

    // Fonction pour rétablir la propriété du tableau de Young après l'insertion
    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? this.getElement(i + 1, j) : INF;
        int right = (j + 1 < m) ? this.getElement(i, j + 1) : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            this.setElement(i, j, down);
            equilibrerTableau(i + 1, j);
        } else {
            this.setElement(i, j, right);
            equilibrerTableau(i, j + 1);
        }
    }

    public int extraireMin() {
        if (this.getElement(0, 0) == INF) {
            return INF; // Aucun élément n'est inséré dans le tableau
        } else {
            int min = this.getElement(0, 0);
            this.setElement(0, 0, INF);
            equilibrerTableau(0, 0);
            return min;
        }
    }
}
