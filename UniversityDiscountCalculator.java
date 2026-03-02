/*
 * Program Name: UniversityDiscountCalculator
 * Purpose: Calculate discount amount and final fee.
 */

class UniversityDiscountCalculator {

    public static void main(String[] args) {

        // Create variable for course fee
        double fee = 125000;

        // Create variable for discount percentage
        double discountPercent = 10;

        // Calculate discount amount
        double discountAmount = fee * discountPercent / 100;

        // Calculate final discounted fee
        double finalFee = fee - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " 
                + discountAmount 
                + " and final discounted fee is INR " 
                + finalFee);
    }
}