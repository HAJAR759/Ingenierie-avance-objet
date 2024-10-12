package exercice3;

public class MatriceYoung {
    protected int[][] tableau;
    protected int n; // nombre de lignes
    protected int m; // nombre de colonnes
    protected static final int INF = Integer.MAX_VALUE; // valeur pour représenter les cases vides

    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        tableau = new int[n][m];

        // Initialiser la matrice avec des valeurs infinies
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tableau[i][j] = INF;
            }
        }
    }

    public int getElement(int i, int j) {
        return tableau[i][j];
    }

    public void setElement(int i, int j, int value) {
        tableau[i][j] = value;
    }

    public void printTabbleau() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tableau[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(tableau[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
