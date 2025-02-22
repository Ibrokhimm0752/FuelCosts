import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons, mpg, pricePerGallon;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number!");
                in.next();
            }
            gallons = in.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number!");
                in.next();
            }
            mpg = in.nextDouble();
        } while (mpg <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number!");
                in.next();
            }
            pricePerGallon = in.nextDouble();
        } while (pricePerGallon <= 0);

        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        System.out.printf("\nThe cost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.\n", maxDistance);

        in.close();
    }
}
