import java.util.Scanner;
import java.lang.Math;

public class Lab3 {

    //Square each number in the array (1 to number entered)
    public static int[] squared(int[] numberSquared, int numberEntered) {

        for (int i = 0; i < numberEntered; ++i) {
            numberSquared[i] = (int) Math.pow((double) (i + 1), 2);
        }

        return numberSquared;
    }

    //Cube each number in the array (1 to number entered)
    public static int[] cubed(int[] numberCubed, int numberEntered) {

        for (int i = 0; i < numberEntered; ++i) {
            numberCubed[i] = (int) Math.pow((double) (i + 1), 3);
        }

        return numberCubed;
    }

    //Display a table of powers
    public static void main(String[] args) {

        System.out.println("Learn your squares and cubes!");

        final int MAX_INT = 2147483647;
        char keepGoing = 'y';
        Scanner entry = new Scanner(System.in);

        //Continue as long as the user would like
        while ((keepGoing == 'y') || (keepGoing == 'Y')) {

            //Prompt the user to enter an integer
            System.out.print("Enter an integer: ");
            int baseNumber = entry.nextInt();

            //Limit the user to prevent cubed values over a maximum integer
            if(Math.pow((double) (baseNumber), 3) >= MAX_INT){
                System.out.print("Please choose a lower number: ");
                baseNumber = entry.nextInt();
            }

            int[] squaredNumbers = new int[baseNumber];
            int[] cubedNumbers = new int[baseNumber];

            squared(squaredNumbers, baseNumber);
            cubed(cubedNumbers, baseNumber);

            //Display a table of squares and cubes from 1 to the value entered (used %-10s to align left)
            System.out.printf("%-10s %-10s %-10s %n", "Number", "Squared", "Cubed");
            System.out.printf("%-10s %-10s %-10s %n", "=======", "=======", "======");

            for (int i = 0; i < baseNumber; ++i) {
                System.out.printf("%-10s %-10s %-10s %n", i + 1, squaredNumbers[i], cubedNumbers[i]);
            }

            //Ask the user if they would like to continue
            System.out.print("Would you like to continue? (y/n): ");
            keepGoing = entry.next().charAt(0);
        }

        System.out.println("Bye!");
    }
}