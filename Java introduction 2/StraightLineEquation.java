/*
 * Autor: Marta Skowron
 * */
import java.util.Scanner;

public class StraightLineEquation {
    public static void main(String[] args) {
        /**
         * This method reads user input with entered points of the straight line whose equation we are looking for
         * @throws StringIndexOutOfBoundsException if the user did not enter the point according to the instructions
         */
        try {
            System.out.print("Coordinates of the first point (x1;y1):");
            Scanner sc = new Scanner(System.in);
            String p1 = sc.nextLine();
            System.out.print("Coordinates of the second point (x2;y2):");
            String p2 = sc.nextLine();

            if (p1.charAt(0) != '(' && p1.charAt(p1.length() - 1) != ')'
                    && p2.charAt(0) != '(' && p2.charAt(p1.length() - 1) != ')') {
                throw new StringIndexOutOfBoundsException();
            } else {
                int i = 0;
                int l = 0;
                while (p1.charAt(i) != ';') {i += 1; l += 1;}
                float x1 = Float.parseFloat(p1.substring(1, l));
                float y1 = Float.parseFloat(p1.substring(l + 1, p1.length() - 1));

                i = 0;
                l = 0;
                while (p2.charAt(i) != ';') {i += 1; l += 1;}
                float x2 = Float.parseFloat(p2.substring(1, l));
                float y2 = Float.parseFloat(p2.substring(l + 1, p2.length() - 1));

                System.out.println("y = " + equation(x1, y1, x2, y2)[0] + "x + " + equation(x1, y1, x2, y2)[1]);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Wrong format. Remember to stick to the pattern - '(x;y)'.");
        } catch (NumberFormatException e) {
            System.out.println("Wrong format. Your coordinates must be floats separated with '.'.");
        } catch (ArithmeticException e) {
            System.out.println("Points can't have the same arguments.");
        }
    }
    public static float[] equation(float x1, float y1, float x2, float y2) {
        /**
         * This method calculates linear equation coefficients for given coordinates
         * @param x1 value of the x component of the first point
         * @param y1 value of the y component of the first point
         * @param x2 value of the x component of the second point
         * @param y2 value of the y component of the second point
         * @returns coefficient a and b of the line in the form of a two-element array
         * @throws ArithmeticException if x1 == x2
         */
        if (x1 == x2) {
            throw new ArithmeticException();
        } else {
            float a = (y2 - y1) / (x2 - x1);
            float b = y1 - (x1 * a);
            float[] tab = {a, b};
            return tab;
        }
    }
}