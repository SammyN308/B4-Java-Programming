package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {

        int i = 5;
        int z = i++; // i = i + 1;
        // Two actions above
        // 1. assignment / use ---> assigned the z = 5;
        // 2. Increment (post increment) ---> i = i + 1; --> i = 6

        System.out.println(i);
        System.out.println(z);

        System.out.println();

        int a = 10;
        int b = a + 1; // a + 1 --> is NOT a = a + 1
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        int c = ++a;
        // PRE INCREMENT
        // 1. update -- > a = a+1; --> a = 11
        // 2. Use ---> c = 11;
        System.out.println(a);
        System.out.println(c);
    }
}
