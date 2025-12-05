package Day_03;

import java.util.Scanner;
public class NumberReverse {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for reversing: ");
        int n = sc.nextInt(); // 12345
        if(n<0) n=-n;

        int reverse = 0;

        while(n!=0){
            int digit = n % 10;             // 1234 % 10 = 4
            n = n /10;                      // 1234 / 10 = 123
            reverse = reverse * 10 + digit; // 0 * 10 + 4 = 4
        }
        System.out.println("The reversed number for the given number is: " +reverse);
        sc.close();
        }
    }