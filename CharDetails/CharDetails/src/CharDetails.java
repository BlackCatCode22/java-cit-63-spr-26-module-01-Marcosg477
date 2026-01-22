// https://www.w3schools.com/java/java_characters.asp

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = input.next().charAt(0);

        System.out.println("Unicode value: " + (int) ch);
        System.out.println("Is letter: " + Character.isLetter(ch));
        System.out.println("Is digit: " + Character.isDigit(ch));
    }
}
