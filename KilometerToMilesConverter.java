/*
 * Program Name: KilometerToMilesConverter
 * Purpose: Convert distance from kilometers to miles.
 */

class KilometerToMilesConverter {

    public static void main(String[] args) {

        // Create a variable to store distance in kilometers
        double distanceInKilometers = 10.8;

        // Create a variable to store conversion factor
        double kilometerPerMile = 1.6;

        // Create a variable to store converted miles
        double distanceInMiles = distanceInKilometers / kilometerPerMile;

        // Display the result
        System.out.println("The distance " + distanceInKilometers
                + " km in miles is " + distanceInMiles);
    }
}