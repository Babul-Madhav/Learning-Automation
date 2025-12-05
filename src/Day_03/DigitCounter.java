package Day_03;

import java.util.Scanner;
public class DigitCounter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for counting: ");
        int n = sc.nextInt();
        int count=0;

        if(n<0) n = -n;
        if(n==0) {
            count=1;
            System.out.println("Number of Digits in the given number is: "+count);
            sc.close();
            return;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of Digits in the given number are: "+count);
        sc.close();
    }
}
