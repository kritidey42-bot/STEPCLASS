/*
 * Program Name: EarthVolumeCalculator
 * Purpose: Calculate volume of Earth in cubic kilometers.
 */

class EarthVolumeCalculator {

    public static void main(String[] args) {

        // Create variable for radius of Earth
        double radiusInKm = 6378;

        // Create variable for PI
        double pi = 3.141592653589793;

        // Calculate volume using formula (4/3) * pi * r^3
        double volume = (4.0 / 3) * pi * radiusInKm * radiusInKm * radiusInKm;

        // Display result
        System.out.println("The volume of earth in cubic kilometers is "
                + volume);
    }
}