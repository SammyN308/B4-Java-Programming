package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {

        int age = 30;
        System.out.println(age); // 30
        System.out.println(age++); // POST INCREMENT --> PRINT 30 --> then update - x = x + 1; --> x = 31
        System.out.println(age);

        System.out.println(age++); // POST INCREMENT --> PRINT 31 --> then update - x = x + 1; --> x = 32
        System.out.println(age++); // POST INCREMENT --> PRINT 32 --> then update - x = x + 1; --> x = 33
        System.out.println(age); // 33

        System.out.println(++age); // PRE INCREMENT --> update FIRST - x = x + 1; --> 34 ---> PRINT
        System.out.println(age); //34

        System.out.println(--age); // PRE DECREMENT --> update - x = x - 1; --> 33 --> PRINT
        System.out.println(age); //33
        System.out.println(age--); //POST DECREMENT--> PRINT 33 --> update x = x -1; --> x = 32
        System.out.println(age);

        /*
            PRE
                - UPDATE then USE

            POST
                -USE then UPDATE




         */


    }

}
