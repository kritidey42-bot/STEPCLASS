import java.util.Scanner;

/*
 * Program Name: BasicCalculator
 * Purpose: Perform addition, subtraction, multiplication and division.
 */

class BasicCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create variables to store two numbers
        double number1;
        double number2;

        // Take user input
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display result
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);

        input.close();
    }
}