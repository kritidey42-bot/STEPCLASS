import java.util.Scanner;

/*
 * Program Name: TotalIncomeCalculator
 * Purpose: Calculate total income from salary and bonus.
 */

class TotalIncomeCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create variables
        double salary;
        double bonus;

        // Take user input
        System.out.print("Enter salary: ");
        salary = input.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Display result
        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);

        input.close();
    }
}