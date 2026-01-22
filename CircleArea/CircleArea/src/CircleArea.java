// https://www.w3schools.com/java/java_math.asp

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is " + area);
    }
}
