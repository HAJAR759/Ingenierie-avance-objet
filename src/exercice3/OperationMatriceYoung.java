package exercice3;

public class OperationMatriceYoung {
	 private MatriceYoung matrice;
	    private int n;
	    private int m;

	    public OperationMatriceYoung(MatriceYoung matrice, int n, int m) {
	        this.matrice = matrice;
	        this.n = n;
	        this.m = m;
	    }

	    public void insertElement(int key) {
	        if (matrice.getElement(n - 1, m - 1) != Integer.MAX_VALUE) {
	            System.out.println("Le tableau de Young est plein.");
	            return;
	        }
	        matrice.setElement(n - 1, m - 1, key);

	        int i = n - 1;
	        int j = m - 1;
	        while (i > 0 || j > 0) {
	            int top = (i > 0) ? matrice.getElement(i - 1, j) : Integer.MAX_VALUE;
	            int left = (j > 0) ? matrice.getElement(i, j - 1) : Integer.MAX_VALUE;

	            if (key >= top && key >= left) {
	                break; // Clé bien placée
	            } else if (top < left) {
	            	matrice.setElement(i, j, top);
	                i--;
	            } else {
	            	matrice.setElement(i, j, left);
	                j--;
	            }
	        }
	        matrice.setElement(i, j, key);
	    }

	    public int extractMin() {
	        int min = matrice.getElement(0, 0);
	        matrice.setElement(0, 0, Integer.MAX_VALUE);
	        equilibrerTableau(0, 0);
	        return min;
	    }

	    private void equilibrerTableau(int i, int j) {
	        int down = (i + 1 < n) ? matrice.getElement(i + 1, j) : Integer.MAX_VALUE;
	        int right = (j + 1 < m) ? matrice.getElement(i, j + 1) : Integer.MAX_VALUE;

	        if (down == Integer.MAX_VALUE && right == Integer.MAX_VALUE) {
	            return;
	        }

	        if (down < right) {
	        	matrice.setElement(i, j, down);
	            equilibrerTableau(i + 1, j);
	        } else {
	        	matrice.setElement(i, j, right);
	            equilibrerTableau(i, j + 1);
	        }
	    }
}
