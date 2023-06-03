/*
Author: Marta Skowron
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {
        float a, b, c;
        double x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Assume that equation takes the form: ax^x + bc +c.");
            System.out.print("Enter a:");
            a = sc.nextFloat();
            System.out.print("Enter b:");
            b = sc.nextFloat();
            System.out.print("Enter c:");
            c = sc.nextFloat();

            delta = b * b - 4 * a * c;

            if (delta > 0) {
                x1 = (- b + Math.sqrt(delta)) / (2 * a);
                x2 = (- b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two solutions x1 = " + x1 + " and x2 = " + x2 + " in set of real numbers for equation " + a + "x^2 + " + b + "x + " + c);
            } else if (delta == 0) {
                x1 = - b / (2 * a);
                System.out.println("One solution x = " + x1 + " in set of real numbers for equation " + a + "x^2 + " + b + "x + " + c);
            } else {
                System.out.println("No solutions in set of real numbers for equation " + a + "x^2 + " + b + "x + " + c);
            }
        } catch (InputMismatchException e) {
            System.out.println("Data must be numbers. Use a comma for floating point numbers.");
        }
    }
}