/*
 * Author: Marta Skowron
 * Sources: https://dzone.com/articles/sorting-java-arraylist
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListOfStudents {
    public static void main(String[] args) {
        /**
         * This method reads user input with the last name of student and prints the list and number of all students
         * when the program ends.
         */
        String name = "";
        ArrayList<String> names = new ArrayList<>();
        while (!name.equals("stop")) {
            System.out.print("Enter last name or 'stop' if you want to end the program:");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            if (!name.equals("stop")) {
                Boolean znacznik = true;
                for (int i = 0; i < name.length(); i++) {
                    if (!(Character.isLetter(name.charAt(i)) || (name.charAt(i) == '-'))) {
                        znacznik = false;
                        System.out.println("Wrong format. Last names can only contains letters and character '-'.");
                        break;
                    }
                }
                if (znacznik) {names.add(name);}
            } else {
                System.out.println("Number of students: " + names.size());
                Collections.sort(names);
                for (int l = 0; l < names.size(); l++) {
                    System.out.println((l + 1) + ". " + names.get(l));
                }
            }
        }
    }
}