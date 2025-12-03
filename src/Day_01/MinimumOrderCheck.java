/* Day-01/MinimumOrderCheck.java

Write a program that takes a value representing the number of items in a cart and checks if it meets the minimum order requirement (>=5 items) to proceed to checkout.

*/


package Day_01;
import java.util.Scanner;

public class MinimumOrderCheck {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items in your cart: ");
        int cartItems = sc.nextInt();
        if(cartItems <= 0){
            System.out.println("Invalid input. Please enter a positive number of items.");
        } else if(cartItems >= 5){
            System.out.println("Minimum order requirement met, proceed to checkout.");
        } else {
            System.out.println("Minimum order requirement not met, please add 5 or more items to your cart to proceed to checkout.");
        }
        sc.close();
    }
}
