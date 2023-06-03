/*
* Autor: Marta Skowron
* Źródła: https://stackoverflow.com/questions/4051887/how-to-format-a-java-string-with-leading-zero
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        /**
         * This method reads user input with the numbers of day, month and year
         */
        try {
            System.out.print("Number of day:");
            Scanner sc = new Scanner(System.in);
            int day = sc.nextInt();

            System.out.print("Number of month:");
            int month = sc.nextInt();

            System.out.print("Number of year (only common era):");
            int year = sc.nextInt();

            System.out.println(date(day, month, year));
        } catch (InputMismatchException e) {
            System.out.println("Data must be integers");
        } catch (IllegalArgumentException e) {
            System.out.println("Check the correctness of the data and try again.");
        }
    }
    public static String date(int day, int month, int year) {
        /**
         * This method convert numbers od day, month and year into date and returns it.
         * @param day number of day
         * @param month number of month
         * @param year number of year
         * @returns date converted date
         * @throws IllegalArgumentException if the given parameters cannot create a real date
         */
        ArrayList<Integer> m30 = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
        ArrayList<Integer> m31 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        if (((m30.contains(month) && day > 0 && day <= 30) ||
                (m31.contains(month) && day > 0 && day <= 31) ||
                (month == 2 && year % 4 == 0 && year % 100 != 0 && day > 0 && day <= 29) ||
                (month == 2 && year % 4 == 0 && year % 100 == 0 && year % 400 == 0 && day > 0 && day <= 29) ||
                (month == 2 && year % 4 == 0 && year % 100 == 0 && year % 400 != 0 && day > 0 && day <= 28) ||
                (month == 2 && year % 4 != 0 && day > 0 && day <= 28)) && (year > 0 && year <= 9999)) {

            String date;
            date = String.format("%0"+ (3 - Integer.toString(day).length() )+"d%s",0 ,day).substring(1,3) + "-"
                    + String.format("%0"+ (3 - Integer.toString(month).length() )+"d%s",0 ,month).substring(1,3) + "-"
                    + String.format("%0"+ (5 - Integer.toString(year).length() )+"d%s",0 ,year).substring(1,5);
            return date;

        } else if (month < 1 || month > 12){
            throw new IllegalArgumentException();
        } else {
            throw new IllegalArgumentException();
        }
    }
}