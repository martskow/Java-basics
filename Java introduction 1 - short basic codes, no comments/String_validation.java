
import java.util.Scanner;

public class String_validation {
    public static void main(String[] args) {
        String char = " ";

        System.out.print("Enter a reference string: ");
        Scanner sc = new Scanner(System.in);
        String str_ref = sc.nextLine().toUpperCase();

        while (!char.equals("STOP")) {
            Boolean marker = true;
            System.out.print("Enter a string you wat to compare with reference string: ");
            String str_com = sc.nextLine().toUpperCase();
            if (!str_com.equals("STOP")) {
                StringBuilder znaki = new StringBuilder();
                for (int i = 0; i < str_com.length(); i++) {
                    if (str_ref.indexOf(str_com.charAt(i)) == -1) {
                        marker = false;
                        znaki.append(str_com.charAt(i)).append(" ");
                    }
                }
                if (!marker) {
                    System.out.println("Your string doesn't mach with reference string.\n" + "Non-reference characters: " + znaki + ".");
                } else {
                    System.out.println("All of charts in your string mach with reference string.");
                }
            }
            System.out.print("If you want to quit enter 'STOP': ");
            char = sc.nextLine().toUpperCase();
        }
    }
}
