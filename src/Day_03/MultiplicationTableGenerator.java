package Day_03;

import java.util.Scanner;
public class MultiplicationTableGenerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate multiplication table: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Enter a valid number which is greater than 0");
            sc.close();
            return;
        }

        System.out.println("Below is the multiplication table for "+n + "\n");

        for(int i=1; i<=10; i++){
            int mul = n*i;
            System.out.println( n + " * " + i + " = " + mul);
        } sc.close();
    }
}
