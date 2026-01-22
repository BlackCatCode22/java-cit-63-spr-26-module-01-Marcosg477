// https://www.w3schools.com/java/java_variables.asp

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter interest rate (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter time (years): ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + interest);
    }
}
