/**
 * Program that calculates the distance between two trains.
 * The user inputs the speed and time of each train,
 * and the program calculates the absolute difference between the distances.
 * 
 * Example output: "The distance between the trains is 5.0 km."
 * 
 * @author (Eylon Maayan)
 * @version (mamn 11)
 */

 import java.util.Scanner;

 public class Train {
     public static void main(String[] args) {
         // Create a Scanner object to get input from the user
         Scanner scan = new Scanner(System.in);
 
         // Prompt the user to enter 4 integers: speed and time for both trains
         System.out.println("Please enter 4 integers:");
         
         System.out.println("Please enter the speed of train 1:");
         int v1 = scan.nextInt();
 
         System.out.println("Please enter the time of train 1:");
         int t1 = scan.nextInt();
 
         System.out.println("Please enter the speed of train 2:");
         int v2 = scan.nextInt();
 
         System.out.println("Please enter the time of train 2:");
         int t2 = scan.nextInt();
 
         // Calculate the distance traveled by each train
         double d1 = v1 * t1;
         double d2 = v2 * t2;
 
         // Calculate the absolute difference between the distances
         double distance = Math.abs(d2 - d1);
 
         // Print the result with one decimal point (even if it's ".0")
         System.out.printf("The distance between the trains is %.1f km.\n", distance);
     }
 }
 