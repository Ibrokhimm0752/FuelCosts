import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        String trash;
        boolean done;

        // Get number of gallons in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!");
                done = false;
            }
        } while (!done);

        // Get fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!");
                done = false;
            }
        } while (!done);

        // Get price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!");
                done = false;
            }
        } while (!done);

        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        System.out.printf("\nThe cost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.\n", maxDistance);

        in.close();
    }
}
