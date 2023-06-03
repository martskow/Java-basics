/*
Author: Marta Skowron
Sources: https://pl.wikipedia.org/wiki/Rzut_uko%C5%9Bny_(fizyka)
https://www.geeksforgeeks.org/java-toradians-method-example/
https://www.w3schools.com/java/java_try_catch.asp
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Projectile_Motion {
    public static void main(String[] args) {
        double speed, angle, distance, height;
        float g = 9.81F;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter speed [m/s]:");
            speed = sc.nextDouble();
            System.out.print("Enter angle [degrees]:");
            angle = sc.nextDouble();

            if (speed >= 0 && angle > 0 && angle < 90){
                angle = Math.toRadians(angle);
                height = speed * speed * Math.sin(angle) * Math.sin(angle) / (2 * g);
                distance = speed * speed * Math.sin(2 * angle) / g;

                System.out.println("Maximum height: " + height + "m, maximum distance: " + distance + "m");
            } else {
                System.out.println("Incorrectly entered data");
            }
        } catch (InputMismatchException e) {
            System.out.println("Data must be numbers. Use a comma for floating point numbers.");
        }
    }
}