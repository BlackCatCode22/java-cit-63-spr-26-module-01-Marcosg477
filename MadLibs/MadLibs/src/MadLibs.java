// https://www.w3schools.com/java/java_strings.asp

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.println("The " + adjective + " " + noun + " loves to " + verb + " every day.");
    }
}
