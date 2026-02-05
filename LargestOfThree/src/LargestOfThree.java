import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        int largest;

        if (a > b) {
            if (a > c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b > c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
