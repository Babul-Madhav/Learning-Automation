package Day_03;

import java.util.Scanner;
public class OddNumbersInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start limit: ");
        int start = sc.nextInt();
        System.out.println("Enter the stop limit: ");
        int stop = sc.nextInt();

        if(start >= stop){
            System.out.println("Start value must be greater than Stop value!");
            sc.close();
            return;
        }

        for(int i=start; i<=stop; i++){
            if(i%2==1){
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }
}
