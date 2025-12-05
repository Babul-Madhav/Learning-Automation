package Day_03;

import java.util.Scanner;
public class LCMCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        long num1= sc.nextLong();
        System.out.println("\nEnter the second number: ");
        long num2= sc.nextLong();

        if(num1<=0 || num2<=0){
            System.out.println("Enter number greater than 0");
            sc.close();
            return;
        }

        long a = num1;
        long b = num2;

        while(b!=0){
            long reminder = a % b;
            a = b;
            b = reminder;
        }
        long GCD = a;
        long LCM= (num1 * num2)/GCD;
        System.out.println("\nLCM of " + num1 + " and " + num2 + " is: " + LCM);
        sc.close();
    }
}
