import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area and the perimeter of a given triangle.");
        System.out.println("Please enter the three lengths of the triangle's sides:");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > 0 && b > 0 && c > 0) { // בדיקה שכל הצלעות חיוביות
            System.out.println("The lengths of the triangle sides are: " + a + ", " + b + ", " + c);
            if (a + b > c && a + c > b && b + c > a) { // בדיקה שהצלעות יכולות להיות של משולש
                int perimeter = a + b + c;
                double s = (a + b + c) / 2.0;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                System.out.println("The perimeter of the triangle is: " + perimeter);
                System.out.println("The area of the triangle is: " + area);
            } else {
                System.out.println("The given three sides don't represent a triangle.");
            }
        } else {
            System.out.println("the given three side dont represent a tringle.");
        }

        scan.close();
    }
}
