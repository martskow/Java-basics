import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplication_Table2 {
    public Multiplication_Table() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Choose number from 1 to 9: ");
            int n = sc.nextInt();
            int[][] tab = new int[n+1][n+1];
            if (n > 0 && n < 10) {
                for(int i = 1; i <= n; ++i) {
                    System.out.println();
                    for(int j = 1; j <= n; ++j) {
                        tab[i][j] = i * j;
                        System.out.print("" + tab[i][j] + "\t");
                    }
                }
            } else {
                System.out.println("Data must be integers from 1 to 9");
            }
        } catch (InputMismatchException var6) {
            System.out.println("Data must be integers");
        }

    }
}
