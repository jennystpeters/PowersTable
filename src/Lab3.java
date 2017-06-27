import java.util.Scanner;
import java.lang.Math;

public class Lab3 {

    public static int[] squared(int[] numberSquared, int numberEntered) {

        for (int i = 0; i < numberEntered; ++i) {
            numberSquared[i] = (int) Math.pow((double) (i + 1), 2);
        }

        return numberSquared;
    }

    public static int[] cubed(int[] numberCubed, int numberEntered) {

        for (int i = 0; i < numberEntered; ++i) {
            numberCubed[i] = (int) Math.pow((double) (i + 1), 3);
        }

        return numberCubed;
    }

    //Display a table of powers
    public static void main(String[] args) {

        System.out.println("Learn your squares and cubes!");

        char keepGoing = 'y';
        Scanner entry = new Scanner(System.in);

        //Ask if the user wants to continue
        while ((keepGoing == 'y') || (keepGoing == 'Y')) {

            //Prompt the user to enter an integer
            System.out.print("Enter an integer: ");
            final int BASE_NUMBER = entry.nextInt();

            int[] squaredNumbers = new int[BASE_NUMBER];
            int[] cubedNumbers = new int[BASE_NUMBER];

            squared(squaredNumbers, BASE_NUMBER);
            cubed(cubedNumbers, BASE_NUMBER);

            //Display a table of squares and cubes from 1 to the value entered (used %-10s to align left)
            System.out.printf("%-10s %-10s %-10s %n", "Number", "Squared", "Cubed");
            System.out.printf("%-10s %-10s %-10s %n", "=======", "=======", "======");

            for (int i = 0; i < BASE_NUMBER; ++i) {
                System.out.printf("%-10s %-10s %-10s %n", i + 1, squaredNumbers[i], cubedNumbers[i]);
            }

            System.out.print("Would you like to continue? (y/n): ");
            keepGoing = entry.next().charAt(0);
        }
        System.out.println("Bye!");
    }
}