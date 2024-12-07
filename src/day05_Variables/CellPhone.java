package day05_Variables;
/*
create a class CellPhone
create a main method
declare and assign these variables
brand, model , color, price, storage,hasCamera, sim (char A, B, C)
 */




public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple", model = "iPhone16" , color = "Matte Black";
        double price = 999.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I just bought an " + model + " from " + brand);
        System.out.println("It is in the color of " + color + " and it has " + storage + " GB ");
        System.out.println("It has " + sim + " sim card and with the camera being " + hasCamera + " and the total price is $" + price);

        System.out.println("---------");

        System.out.println("I just bought an " + model+ "from" + brand + "\n" + "It is in the color of " + color + "and it has " + storage + " GB \n" + "It has " + sim + " sim card and with the camera being " + hasCamera + " and the total prices is $" + price);

        System.out.println("----------");
        String fullMessage = "I just bought an " + model+ "from" + brand + "\n" + "It is in the color of " + color + "and it has " + storage + " GB \n" + "It has " + sim + " sim card and with the camera being " + hasCamera + " and the total prices is $" + price;
        System.out.println(fullMessage);


    }
}
