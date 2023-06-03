import java.util.Scanner;

/*
Author: Marta Skowron
Sources:
https://www.programiz.com/java-programming/examples/check-string-numeric
https://beginnersbook.com/2019/04/java-hexadecimal-to-decimal-conversion/
*/
public class colors_RGB {
    public static void main(String[] args) {
        System.out.print("Enter HEX code (#RRGGBB): ");
        Scanner sc = new Scanner(System.in);
        String HEX = sc.nextLine();

        if (HEX.charAt(0) == '#') {
            try {
                int r = Integer.parseInt(HEX.substring(1,3), 16);
                int g = Integer.parseInt(HEX.substring(3,5), 16);
                int b = Integer.parseInt(HEX.substring(5,7), 16);
                System.out.println("(" + r + ", " + g + ", " + b + ")");

            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                System.out.println("Wrong format. Try again.");
            }
        } else {
            System.out.println("Wrong format. Try again.");
        }
    }
}