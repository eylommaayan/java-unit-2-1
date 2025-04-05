/**
 * Program that calculates the area and perimeter of a trapezoid.
 * 
 * The user is asked to enter the coordinates of the left point of each base
 * along with the base's length. The program uses these inputs to calculate:
 * 

 * Author: Eylon Maayan
 * Version: mamn 11
 */



import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get input for the first base: left point (x1, y1) and its length
        System.out.println("Please enter the left point coordinates of the base followed by its length:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int length1 = scan.nextInt();

        // Get input for the second base: left point (x2, y2) and its length
        System.out.println("Please enter the left point coordinates of the other base followed by its length:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int length2 = scan.nextInt();

        // Calculate the right endpoint of the first base (point B)
        int x3 = x1 + length1;
        int y3 = y1;

        // Calculate the right endpoint of the second base (point C)
        int x4 = x2 + length2;
        int y4 = y2;

        // Calculate the left side (distance between points A and D)
        double leftSide = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // Calculate the right side (distance between points B and C)
        double rightSide = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));

        // Calculate the height of the trapezoid (vertical distance between the bases)
        double height = Math.abs(y1 - y2);

        // Calculate the area using the trapezoid formula
        double area = ((length1 + length2) * height) / 2.0;

        // Calculate the perimeter: sum of all four sides
        double perimeter = length1 + length2 + leftSide + rightSide;

        // Print the results with the required formatting
        System.out.printf("The area of the trapezoid is ", area);
        System.out.printf("The perimeter of the trapezoid is ", perimeter);
    }
}
