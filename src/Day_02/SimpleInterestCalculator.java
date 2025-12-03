/* Day-02/SimpleInterestCalculator

Input principal, rate, time. Compute simple interest using SI = (P * R * T) / 100.

 */

package Day_02;

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount value: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest value: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time for no of years: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time)/100.0;
        System.out.printf("Simple Interest for the entered details is: %.2f", simpleInterest);
        sc.close();
    }
}
