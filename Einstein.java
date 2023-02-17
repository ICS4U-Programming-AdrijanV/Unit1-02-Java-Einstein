// Importing
import java.util.Scanner;
/**
* Get the radius from the user to calculate
* the volume of a sphere.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-14
*/

// Making class
public final class Einstein {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility class.");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {
        // set constants
        final double speedOfLight = 299792458;
        // Using scanner to get user input
        System.out.println("What is the mass (kg)?");
        final Scanner scanner = new Scanner(System.in);
        final String userMass = scanner.nextLine();
        try {

            // Make user input a double.
            final double massDouble = Double.parseDouble(userMass);
            // Check for valid input.
            if (massDouble >= 0) {
                // calculate
                final double energy = massDouble * Math.pow(speedOfLight, 2);

                System.out.println("The energy released is "
                    + String.format("%.3f", energy) + " joules.");
            } else {
                // Print this if the user enter an invalid input.
                System.out.println("This in not a valid input.");
            }

        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid mass!"
                + error.getMessage());
        }
        // Close scanner.
        scanner.close();
    }
}
