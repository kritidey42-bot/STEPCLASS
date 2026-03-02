import java.util.Scanner;

/*
 * Program Name: SquareSideCalculator
 * Purpose: Find the side of the square using perimeter.
 */

class SquareSideCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create variable for perimeter
        double perimeter;

        // Take user input
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate side length
        double sideLength = perimeter / 4;

        // Display result
        System.out.println("The length of the side is "
                + sideLength + " whose perimeter is "
                + perimeter);

        input.close();
    }
}