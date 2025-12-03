package Day_02;

import java.util.Scanner;
public class DaysConverter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Days for Conversion into Years, Weeks and Days: ");
        int totalDays = sc.nextInt();

        if(totalDays <0){
            System.out.println("Days cannot be negative!");
            sc.close();
            return;
        }

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println ("Years: " + years);
        System.out.println ("Weeks: " + weeks);
        System.out.println ("Days: " + days);

    }

}
