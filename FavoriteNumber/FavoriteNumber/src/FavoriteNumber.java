// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your favorite number: ");
        int number = input.nextInt();

        System.out.println("Your favorite number is " + number + "!");
    }
}
