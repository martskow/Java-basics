import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter n - the length of the fibonacci sequence: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());

            if (n == 0) {
                int fib = 0;
                System.out.println(fib);
            } else if (n == 1) {
                int fib = 1;
                System.out.println(fib);
            } else {
                double[] fib = new double[n];
                fib[0] = 0;
                fib[1] = 1;
                for (int i = 2; i < n; i++) fib[i] = fib[i-1] + fib[i-2];
                System.out.print("[ ");
                for (double v : fib) System.out.print(v + " ");
                System.out.println("]");
            }
        } catch (NumberFormatException e) {
            System.out.println("N must be an integer greater than or equal to 0.");
        }

    }
}