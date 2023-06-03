/*
Author: Marta Skowron
Sources: https://pl.wikipedia.org/wiki/Wska%C5%BAnik_masy_cia%C5%82a
https://www.w3schools.com/java/java_try_catch.asp
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        int height, mass;
        float BMI;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your weight [kg]:");
            mass = sc.nextInt();
            System.out.print("Enter your height [cm]:");
            height = sc.nextInt();

            if (mass > 0 && height > 0) {
                BMI = mass / ((float) height / 100 * (float) height / 100);
                if (BMI < 16) {
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Severe thinness' category ");
                } else if (BMI < 17){
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Moderate thinness' category");
                } else if (BMI < 18.5) {
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Mid thinness' category");
                } else if (BMI < 25) {
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Normal' category");
                } else if (BMI < 30) {
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Overweight' category");
                } else if (BMI < 35) {
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Obese Class I' category");
                } else if (BMI < 40) {
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Obese Class II' category");
                } else if (BMI >= 40) {
                    System.out.println("Your BMI is equal: " + BMI + " and you are classified in 'Obese Class III' category");
                }
            } else {
                System.out.println("Incorrectly entered data");
            }
        } catch (InputMismatchException e) {
            System.out.println("Data must be integers.");
        }
        }
    }
