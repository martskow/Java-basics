/**
 * Author: Marta Skowron
 * Sum of the diagonal of the matrix
 */

public class Matrix {
    public static void main(String[] args) {
        int max = 10, min = 1, x, suma = 0;
        int[][] tab = new int[5][5];
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                x = (int) Math.floor(Math.random() * (max - min + 1) + min);
                tab[i][j] = x;
                System.out.print("" + tab[i][j] + "\t");
                if (i == j) {
                    suma = suma + tab[i][j];
                }
            }
        }
        System.out.println("\nSum of the elements on the diagonal of the matrix: " + suma);
    }
}