import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
* Jomar Lopez 9/14/2022
* Volume of a staircase
*prompts the user for the number of steps in the staircase. 
*It will then prompt for and read the width, rise, and run of a step in centimeters. 
*The program will then calculate the number of cubic centimeters of concrete necessary to build the staircase.
*/

public class Staircase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many steps in the staircase? ");
        int steps = input.nextInt();

        System.out.print("Enter step width in cm: ");
        double width = input.nextDouble();

        System.out.print("Enter rise of the step in cm: ");
        double rise = input.nextDouble();

        System.out.print("Enter run of the step in cm: ");
        double run = input.nextDouble();

        double totalVolume = ((steps * (steps + 1)) / 2) * width * rise * run;

        int volRounded = (int) (Math.ceil(totalVolume));

        System.out.println(String.format("Total volume is %s cubic centimeters.", volRounded));

        BigDecimal bd = BigDecimal.valueOf(totalVolume).ROUND_FLOOR;
        Precision.round(bd, 3);
    }
}