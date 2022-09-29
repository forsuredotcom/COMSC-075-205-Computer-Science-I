import java.util.Scanner;

/*Jomar Lopez
 * 9/14/2022
 * Calculates three different kinds of means (averages) of three numbers
 */

public class Means{
    static double firstNum, secondNum, thirdNum;
    static double reciprocalFirstNum, reciprocalSecondNum, reciprocalThirdNum;
    static double arithmeticMean, geometricMean, harmonicMean; 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNum = in.nextDouble();
        System.out.print("Enter second number: ");
        secondNum = in.nextDouble();
        System.out.print("Enter third number: ");
        thirdNum = in.nextDouble();

        //Return the result from step 3— it is the harmonic mean.
        harmonicMean = harmonicMean(firstNum, secondNum, thirdNum);

        System.out.printf("Arithmetic mean: %f \n", arithmeticMean);
        System.out.printf("Geometric mean: %f \n", geometricMean);
        System.out.printf("Harmonic mean: %f \n", harmonicMean);
    }

    private static double reciprocal(double input){
        return (1.0 / input);
    }

    private static double arithmeticMean(double val1, double val2, double val3){
        return (val1 + val2 + val3) / 3;
    }

    private static double geometricMean(double val1, double val2, double val3){
        return (Math.pow((val1 * val2 * val3), (1.0 / 3.0) ) );
    }

    private static double harmonicMean(double val1, double val2, double val3){
        //Get the reciprocals of the three numbers.
        reciprocalFirstNum = reciprocal(firstNum);
        reciprocalSecondNum = reciprocal(secondNum);
        reciprocalThirdNum = reciprocal(thirdNum);
    
        //Calculate the arithmetic mean of the numbers from step 1.
        arithmeticMean = arithmeticMean(firstNum, secondNum, thirdNum);

        //Calculate the reciprocal of the result you got in step 2.
        geometricMean = geometricMean(firstNum, secondNum, thirdNum);

        return (3 / (reciprocalFirstNum + reciprocalSecondNum + reciprocalThirdNum));
    }

}
