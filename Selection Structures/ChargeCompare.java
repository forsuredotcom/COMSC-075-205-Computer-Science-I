import java.util.ArrayList;
import java.util.Scanner;

public class ChargeCompare {
    static double evDynamicsCost;
    static double elektraChargeCost;

    public static void main(String[] args) {
        int minutes = getMinutes();
        if (minutes > 0) {
            evDynamicsCost = calculateCost(minutes, 15, 0.27, 0.30);
            System.out.printf("Cost for EV Dynamics:   $%.2f\n", evDynamicsCost);
            elektraChargeCost = calculateCost(minutes, 20, 0.25, 0.35);
            System.out.printf("Cost for ElektraCharge: $%.2f\n", elektraChargeCost);

            if (evDynamicsCost < elektraChargeCost ) {
                System.out.println("EV Dynamics is cheaper.");
            } else if (elektraChargeCost < evDynamicsCost) {
                System.out.println("ElektraCharge is cheaper.");
            } else {
                System.out.println("ElektraCharge and EV Dynamics prices are the same.");
            }

        } else {
            System.out.println("Minutes must be greater than zero.");
        }
    }

    private static int getMinutes() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number of minutes you want to charge your vehicle: ");
            int result = input.nextInt();
            return result;
        }
    }

    private static double calculateCost(int mins, int limit, double priceBeforeLimit, double priceAfterLimit) {
        double result;
        if (mins > limit) {
            result = ((mins - limit) * priceAfterLimit) + (limit * priceBeforeLimit);
        } else {
            result = mins * priceBeforeLimit;
        }
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }
}
