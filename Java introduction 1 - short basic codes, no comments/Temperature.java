/*
Author: Marta Skowron
Sources: https://www.metric-conversions.org/temperature/fahrenheit-to-celsius.htm
https://www.w3schools.com/java/java_try_catch.asp
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int way;
        float temperature;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number 1 if you want to convert Celsius to Fahrenheit, or 2 otherwise: ");
            way = sc.nextInt();

            System.out.print("Enter temperature: ");
            temperature = sc.nextFloat();

            if (way == 1 && temperature < 1000 && temperature > -1000) {
                temperature = (float) (temperature * 1.8) + 32;
                System.out.println("Your temperature in Fahrenheit is equal: " + temperature + "F.");
            } else if (way == 2 && temperature < 1000 && temperature > -1000) {
                temperature = (float) ((temperature - 32) / 1.8);
                System.out.println("Your temperature in Celsius is equal: " + temperature + "C.");
            } else {
                System.out.println("Incorrectly entered data");
            }
        } catch (InputMismatchException e) {
            System.out.println("Data must be numbers. Use a comma for floating point numbers.");
        }

    }
}