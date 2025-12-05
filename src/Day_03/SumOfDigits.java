package Day_03;

import java.util.Scanner;
public class SumOfDigits {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number to sum all the digit: ");
        int n = sc.nextInt();
        int original = n;
        int sign = (n<0) ? -1 : 1;
        n = Math.abs(n);

        int sum = 0;
        while(n!=0){
            int digit = n % 10;
            sum+=digit;
            n = n/10;
        }
        System.out.println("The given number is " + original +" and the sum of all the digits is: " + sum);
        sc.close();
    }

}
