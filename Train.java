/**
 * Program that calculates the distance between two trains.
 *
 * @author (Eylon Maayan)
 * @version (mamn 11 )
 */
import java.util.Scanner;

public class Train {
    public static void main (String[] args) {
        // Scanning data from the user
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 4 integers:");
        System.out.println("Please enter the speed of train 1:");
        int v1 = scan.nextInt();

        System.out.println("Please enter the time of train 1:");
        int t1 = scan.nextInt();

        System.out.println("Please enter the speed of train 2:");
        int v2 = scan.nextInt();

        System.out.println("Please enter the time of train 2:");
        int t2 = scan.nextInt();

        // Calculate distance of each train
        int d1 = v1 * t1;
        int d2 = v2 * t2;

        // Calculate the distance between them
        int distance = Math.abs(d2 - d1);

        System.out.println("The distance between the two trains is " + distance + " km");
    }
}
