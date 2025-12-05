package Day_03;

import java.util.Scanner;
public class FactorialCalculator {

    public static void main(String[] args){

        //Read the Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = sc.nextInt();

        //Validation on the Input
        if(n<0){
            System.out.println("Enter value greater than 0");
            sc.close();
            return;
        }

        //Processing the Valid Input
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.println("Factorial for the given number is: " + fact);
        sc.close();
    }
}
