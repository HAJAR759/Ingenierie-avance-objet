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
public class MatriceYoung  extends ArrayList<Object> {
    private static final int INF = Integer.MAX_VALUE;
    private int n;
    private int m;
    public MatriceYoung(int n , int m ) {
        super(n);
        this.n=n;
        this.m = m;
        for (int i = 0; i < n; n++){
            this.add(new ArrayList<Integer>(m));
            for (int j = 0; j < m; j++){
                this.setElement(i,j,INF);
            }
        }
    }
    
   
    public void printTabbleau(){
        for(int i = 0; i < n; i++){
            for(int j= 0; j< m; j++){

                if(this.getElement(i,j)==INF){
                    System.out.print("INF" + ";");
                }
                else{
                    System.out.print(this.getElement(i,j) + ";");
                }
            }
            System.out.println();
        }
    }
    public int getElement(int i,int j){
        return ((ArrayList<Integer>) this.get(i)).get(j);
    }
    public void setElement(int i, int j , int valeur){
        ((ArrayList<Integer>) this.get(i)).set(j,valeur);
    }
}