package day04_variables;



public class Fruits {

    public static void main(String[] args) {
// have 3 containers and each container will have have x number of apples, grapes and bananas
        int apples = 70;
        int grapes = 80;
        int bananas = 100;
        // println statement
        // "" ---> value which is string
        // + ---> CONCATENATION / plus (math)
        // 60 ---> value which is whole number (by default it is int)
        System.out.println("This is how many apples I have: " + 60) ; // The Value 60 ---> HARDCODED

        System.out.println("This is how many apples I have: " + apples) ; // The apples is a variable---> DYNAMICALLY

        System.out.println(grapes);               //grapes.sout
        System.out.println("grapes = " + grapes); // grapes.soutv
        System.out.println("bananas = " + bananas);

        System.out.println("------");
        //REASSIGNMENT
        //I sold 30 apples
        System.out.println("I sold 30 apples");
        apples = 40; //Reassign a variable called apples to the new value which is 40
        System.out.println("This is how many apples i have after the sale : " +apples);

        System.out.println("------");
        double price =16.99;
        System.out.println("The discounted price for all the left over apples is $" + "15.99");  //"15.99"---> HARDCODED
        System.out.println("The discounted price for all the left over apples is $" + price);  // "price" ---> DYNAMIC

        System.out.println("------");
        //CONCATENATION vs plus (math)
        System.out.println(50 + 50);  //plus (math) ---> 100
        System.out.println("50" + 50); //CONCATENATION---->5050

        System.out.println(10 + 10 + "10" + 10 + 10);
        //int + int + String +int +int
        // int + String + int +int ---> 20 + "10" + 10 + 10
        //      String + int +int  ----> "2010" + 10 + 10
        //           String + int ---->   "201010" + 10
        //               String   ---->    "20101010"
        System.out.println("10" + 10 + "10" + 10 + 10);
        //After first String --- > everything becomes String ---> EVERYTHING is a CONCATENATION

        System.out.println(10 + "apple" + 10 + " " + 10);




    }
}
