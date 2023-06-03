/*
Author: Marta Skowron
Sources: https://www.geeksforgeeks.org/java-math-random-method-examples/
*/
import java.util.Scanner;

public class Cups {
    public static void main(String[] args) {
        int max = 3, min = 1, end = 1;
        Scanner sc = new Scanner(System.in);
        int cup, x;

        while (end != 0) {
            x = (int)Math.floor(Math.random() * (max - min + 1) + min);
            System.out.print("Choose a cup (numbers from 1 to 3): ");
            cup = sc.nextInt();
            if (cup < 1 || cup > 3) {
                System.out.println("Wrong number. Try again");
            } else {
                if (x == cup) {
                    System.out.println("You won! The lucky cup is yours - " + x);
                } else {
                    System.out.println("Not this time! The lucky cup is - " + x);
                }
            }
            System.out.print("Enter 0 to end the game or 1 to play again:");
            end = sc.nextInt();
        }
    }
}