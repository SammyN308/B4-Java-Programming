package day09_a_scanner;
/*
write a program that asks the user to
enter a price
and quantity
and then calculate the revenue. revenue = price x quantity.
 */
// First- DO IMPORT
// Q: Why we need to import
//A; Since we are working in one package but we need something from different package, we need to import it first to be able to use anything inside of that package
import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double revenue;
        System.out.println("Please, enter the price of the item: $");
        double price = input.nextDouble(); //Taking value from user. = storing it into variable called price

        //input.nextDouble(); // Taking Value from user.

        System.out.println("Please, enter the quantity of the item:");
        int quantity = input.nextInt();

        revenue = price * quantity; // double * int casts to bigger datatype and becomes double
        System.out.println("The revenue of the sale is $" + revenue);




    }
}