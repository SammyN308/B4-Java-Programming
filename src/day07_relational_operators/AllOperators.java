package day07_relational_operators;

public class AllOperators {
    public static void main(String[] args) {

        System.out.println(5 + 2 * 4);
        // 5 + 8
        // 13

        System.out.println(5 * 2  + 6 / 2);
        // 10 + 6 / 2
        // 10 + 3
        // 13


        System.out.println(5 + 2 > 4 + 6);
        // 7 > 10
        // false


        int a = 20; // 19 -> 20 -> 19 -> 18
        int b = -a-- + a++ + --a * a--;
        //  b = -20 + 19 + 19 * 19
        //  b = -20 + 19 + 361
        //  b = -1 + 361
        //  b = 360

        int x = 6;
        //boolean result1 = 1 > x < 10; // x is in the range between 4 and 10
        boolean result2 = 1 < x || x < 10; // x is in the range between 4 and 10

    }
}
