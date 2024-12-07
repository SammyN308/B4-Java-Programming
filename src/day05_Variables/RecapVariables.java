package day05_Variables;

public class RecapVariables {
    public static void main(String[] args) {

        // Declared some variables
        //byte num$OfTeaCup; is valid
        // double total_Price_$; is valid
        // total%Price; is not valid
        // int Public 45; is valid
        // int public 45; IS NOT VALID, JAVA RESERVED WORD

        // These are LOCAL VARIABLES. WE HAVE DECLARED
        byte numOfTeacup;
        double totalPrice;
        int numOfTotalStudents;

        // System.out.println(numOfTeaCup); will not work because it has not been initialized
        //system.out.println(totalPrice); will not work
        // Since we have NOT given initial values to these variables we CANNOT USE THEM

        //ASSIGNING / INITIALIZING the variables
        numOfTeacup = 4;
        totalPrice = 20.0;
        numOfTotalStudents = 30;

        // Since we have given/ASSIGNED the VALUES now, we can use those variables/containers
        System.out.println(numOfTeacup);
        System.out.println(totalPrice);
        System.out.println(numOfTotalStudents);

        System.out.println("------");
        System.out.println(numOfTeacup * numOfTotalStudents); // 4 * 30, int multiplied by int will give us 120
        System.out.println(numOfTeacup + " * " + numOfTotalStudents); // int + String + int will give us 4 * 30, this is CONCATENATION

        // Declare and Assign in ONE statement together
        double temperature = 67.7;
        int day = 4;
        System.out.println("Today is " + 4 + "th day of the week\n"); // HARDCODED
        System.out.println("Today is " + day + "th day of the week\n"); //DYNAMIC CODE because we are using the variable name from int

        System.out.println("Today the weather was " + temperature + " degrees");

        System.out.println("---------");
        System.out.println("Test: " + 4 + 5 ); // Test: 45
        System.out.println("Test: " + (4 + 5)); //Test: 9







    }
}


