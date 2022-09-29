import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        System.out.print("Enter weight of package in pounds: ");

        try (Scanner input = new Scanner(System.in)) {
            double weight = input.nextDouble();
            double cost = 0;
        }

        if (weight <= 0.00) {
            System.out.print("Weight must be greater than zero.");
        } else if (weight > 0 && weight <= 2) {
            cost = 3.50;
        } else if (weight > 2 && weight <= 7) {
            cost = 5.90;
        } else if (weight > 7 && weight <= 16) {
            cost = 10.85;
        } else if (weight > 16 && weight <= 25) {
            cost = 12.35;
        } else {
            System.out.print("Cannot ship - maximum weight is 25 pounds.");
        }
        
        if (cost > 0) {
            System.out.printf("Cost: $%.2f", cost);
        }
    }
}
