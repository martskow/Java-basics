/*
Author: Marta Skowron
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplication_Table1 {
    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Choose number from 1 to 9: ");
            n = sc.nextInt();
            if (n > 0 && n < 10) {
                for (int i = 1; i <= n; i++) {
                    System.out.println();
                    for (int j = 1; j <= n; j++) {
                        x = i * j;
                        System.out.print(x + "\t");
                    }
                }
            } else {
                System.out.println("Data must be integers from 1 to 9");
            }
        } catch (InputMismatchException e) {
            System.out.println("Data must be integers");
        }
    }
}