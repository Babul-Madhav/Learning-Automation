
/* Day-01/FindLargestNumber.java

Accept three integers and print which is larger.

*/

package Day_01;

import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();   
        int largest;
        if(num1>num2 && num1>num3){ // checking if num1 is greater than num2 and num3
            largest = num1;
        } else if(num2>num1 && num2>num3){ // checking if num2 is greater than num1 and num3
            largest = num2;
        } else {
            largest = num3; // if both above conditions are false, num3 is the largest
        } 
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}