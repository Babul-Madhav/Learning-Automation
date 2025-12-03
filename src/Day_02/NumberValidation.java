package Day_02;

import java.util.Scanner;

public class NumberValidation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to validated: ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Given number is a Positive value");
        } else if(n<0){
            System.out.println("Given number is a Negative value");
        }else {
            System.out.println("Given number is Zero");
        }
        sc.close();
    }
}
