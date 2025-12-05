package Day_03;

import java.util.Scanner;
public class GCDCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1= sc.nextInt();
        System.out.println("\nEnter the second number: ");
        int num2= sc.nextInt();

        if(num1 <=0 || num2 <=0){
            System.out.println("Enter a valid number greater than 0!");
            sc.close();
            return;
        }

        int a= num1;
        int b= num2;

        while(b!=0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.println("\nGCD of " + num1 + " and " + num2 + " is: " + a);
        sc.close();
    }
}
