/* Day-01/SumOfNaturalNumbers.java

Print the sum of the first N natural numbers where N is user input.

*/

package Day_01;
import java.util.Scanner;


public class SumOfNaturalNumbers {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a natural number N: ");
        int N = sc.nextInt();
        if(N<=0) {
            System.out.println("Please enter a positive integer.");
            return; // Exit if input is not a natural number.
        }
        int sum = 0;
        for(int i=1; i<=N; i++){ // Alternative: sum = N*(N+1)/2; then print sum.
            sum += i;
        }
        System.out.println("Sum of first " + N + " natural numbers is: " + sum);
        sc.close();
    }
}