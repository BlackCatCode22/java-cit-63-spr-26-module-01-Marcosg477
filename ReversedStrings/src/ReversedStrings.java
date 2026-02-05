import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        String reversed = "";

        for (int i = userString.length() - 1; i >= 0; i--) {
            reversed += userString.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
