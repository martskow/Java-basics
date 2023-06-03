/*
 * Autor: Marta Skowron
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

public class FigureArea {
    public static void main(String[] args) {
        /**
         * This method reads the data given on input by the user - the type of figure and its dimensions necessary
         * to calculate the area.
         * @throws IllegalArgumentException if the user enters a variable other than float
         */
        try {
            System.out.print("Choose the figure (1 - circle, 2 - rectangle, 3 - trapezium):");
            Scanner sc = new Scanner(System.in);
            int figure = sc.nextInt();

            if (figure == 1) {
                try {
                    System.out.print("Enter the radius:");
                    float radius = sc.nextFloat();
                    System.out.println(area(radius));
                } catch (InputMismatchException e) {
                    throw new IllegalArgumentException();
                }
            } else if (figure == 2) {
                try {
                    System.out.print("Enter the length of the first side:");
                    float a = sc.nextFloat();
                    System.out.print("Enter the length of the second side:");
                    float b = sc.nextFloat();
                    System.out.println(area(a, b));
                } catch (InputMismatchException e) {
                    throw new IllegalArgumentException();
                }
            } else if (figure == 3) {
                try {
                    System.out.print("Enter the length of the first base:");
                    float a = sc.nextFloat();
                    System.out.print("Enter the length of the second base:");
                    float b = sc.nextFloat();
                    System.out.print("Enter the height:");
                    float h = sc.nextFloat();
                    System.out.println(area(a, b, h));
                } catch (InputMismatchException e) {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new InputMismatchException();
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("The input must be one of the 3 integers (1, 2, 3) corresponding to the figure type.");
        } catch (IllegalArgumentException e) {
            System.out.println("All of the dimensions must be floats greater than 0.");
        }
    }
    public static float area (float radius) {
        /**
         *The method calculates the area of a circle based on the given radius of the circle.
         * @param radius radius of circle
         * @return area of the circle
         * @throws IllegalArgumentException if radius is less or equal than zero
         */
        if (radius > 0) {
            return (float) (2 * radius * radius * 3.14);
        } else {
            throw new IllegalArgumentException();
        }
    }
    public static float area (float side1, float side2) {
        /**
         *The method calculates the area of a rectangle based on the given sides of this rectangle.
         * @param side1 1st side of rectangle
         * @param side2 2nd side of rectangle
         * @return area of the rectangle
         * @throws IllegalArgumentException if any parameter is less or equal than zero
         */
        if (side1 > 0 && side2 > 0) {
            return side1 * side2;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public static float area (float base1, float base2, float height) {
        /**
         *The method calculates the area of a trapezium based on the given sides and height of this trapezium.
         * @param base1 1st base of trapezium
         * @param base2 2nd base of trapezium
         * @param height height of trapezium
         * @return area of the trapezium
         * @throws IllegalArgumentException if any parameter is less or equal than zero
         */
        if (base1 > 0 && base2 > 0 && height > 0) {
            return height * (base1 + base2) / 2;
        } else {
            throw new IllegalArgumentException();
        }
    }
}