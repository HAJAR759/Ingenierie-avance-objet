package exercice3;

import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;
/*Un tableau de Young (ou tableau de Young-Ferrers) est une disposition d'entiers dans un tableau de cases,
 où les lignes et les colonnes sont ordonnées de manière croissante.
Plus formellement, un tableau de Young remplit ces deux conditions :
 */
/*Les nombres dans chaque ligne sont disposés dans un ordre croissant, c'est-à-dire que
 chaque élément dans une ligne est inférieur ou égal à celui qui le suit.
 */
/*Les nombres dans chaque colonne sont également disposés dans un ordre croissant, c'est-à-dire
que chaque élément dans une colonne est inférieur ou égal à celui qui se trouve en dessous.
 */
/*Le tableau de Young doit implementer deux opérations : Extraire Min et inserer, il faut garder les deux
conditions valables aprs chaque opération.
 */
 /*Exemple :
        1  2  3
        2  4  5
        6  7  8

  */

import java.util.ArrayList;

public class MatriceYoung {
    protected static final int INF = Integer.MAX_VALUE;
    protected int n; // nombre de lignes
    protected int m; // nombre de colonnes
    protected ArrayList<ArrayList<Integer>> tableau;

    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        tableau = new ArrayList<>();

        // Initialiser le tableau avec INF
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>(m);
            for (int j = 0; j < m; j++) {
                row.add(INF); // Initialiser chaque élément à INF
            }
            tableau.add(row); // Ajouter la ligne au tableau
        }
    }

    public void printTableau() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (getElement(i, j) == INF) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(getElement(i, j) + "\t");
                }
            }
            System.out.println();
        }
    }

    protected int getElement(int i, int j) {
        return tableau.get(i).get(j);
    }

    protected void setElement(int i, int j, int valeur) {
        tableau.get(i).set(j, valeur);
    }
}