package day09_a_scanner;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int num = input.nextInt();
        System.out.println("\n" + num);

        boolean isEven = num % 2 == 0; //even


    }
}
