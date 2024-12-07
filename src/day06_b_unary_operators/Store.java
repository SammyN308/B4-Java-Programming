package day06_b_unary_operators;

public class Store {
    public static void main(String[] args) {

        String store = "Costco";
        int numberofTv = 100;

        System.out.println("Someone came into the store and they bought a TV");
        //numberofTv = numberofTv - 1;
        //System.out.println("Number of TV in stock: " + numberofTv);
        System.out.println("Number of TV in stock: " + --numberofTv);

        System.out.println("Another one bought the same TV");
        System.out.println("Number of TV in stock: " + --numberofTv);

        System.out.println("Someone else came into the store and put the TV in the shopping cart but didnt pay yet");
        System.out.println("Number of TV in stock (in computer): " + numberofTv--);
        System.out.println("Person actually now has paid for it.");
        System.out.println("Number of TV in stock (in computer): " + numberofTv);

        System.out.println("More of the same TV came into stock");
        numberofTv = numberofTv + 15;
        System.out.println("Num of TV in stock: " + numberofTv);


    }
}
