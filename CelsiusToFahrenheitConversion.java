import java.util.Scanner;

/*
 * Program Name: CelsiusToFahrenheitConversion
 * Purpose: Convert temperature from Celsius to Fahrenheit.
 */

class CelsiusToFahrenheitConversion {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create variable for Celsius
        double celsius;

        // Take user input
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Perform conversion
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("The " + celsius + 
                " celsius is " + fahrenheitResult + 
                " fahrenheit");

        input.close();
    }
}