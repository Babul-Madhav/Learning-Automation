/* Day-01/MultiplicationTable.java

Print the multiplication table of a number from 1 to 10.

*/


package Day_01;
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int num =sc.nextInt();
        if(num<=0){
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Below is the Multiplication Table of " + num + ":");
            for (int i=1; i<=10; i++){
                System.out.println(num + " * " + i + " = " + (num*i));
            }
        }
            sc.close();
        }
    }