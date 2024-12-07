package day06_a_arithmetic_operators;



public class CastingExample {
    public static void main(String[] args) {

        int num1 = 10;
        float num2 = num1; // going from small to big (float is bigger than int) assigning the small into big which is called WIDENING CASTING and this happens AUTOMATICALLY (Implicitly)
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("--------");
        float num3 = 3.4f;
        short num4 = (short)num3; //assigning the bigger data type to a smaller data type and this is called NARROWING CASTING- HAPPENS MANUALLY (EXPLICITLY) - there might be a data loss
        //short num5 = (int)num3;    // going from FLOAT to INT BUT INT is BIGGER than SHORT so it will not work because INT is still bigger than SHORT
        short num6 = (byte)num3;     // this does not give error because we take FLOAT and casted it to BYTE and BYTE is SMALLER THAN SHORT so short can hold the byte! No need for EXPLICIT CASTING
        System.out.println(num3); //3.4
        System.out.println(num4); // 3
        System.out.println(num6); // 3

        // we can do this because we can convert the char into int because each character has a number assigned to it from ASCII or UNICODE table.
        System.out.println();
        char letter = 'A';
        int letterInNum = letter; // going from SMALLER (CHAR) TO BIG (INT) - no need for EXPLICIT CASTING
        System.out.println(letter);
        System.out.println(letterInNum);

        System.out.println();
        String letter2 = "B";
        //int letterInNum2 = letter2; NOT VALID CANNOT INPUT STRING INTO THE INT DIRECTLY

        System.out.println('C');
        System.out.println((int)'C');
        System.out.println((int)'$');
        System.out.println();
        int i1 = 150;
        byte b1 = (byte)i1;
        System.out.println(i1);
        System.out.println(b1); // data loss because 150 isnt in bytes range, byte cannot hold anything more than 127
        System.out.println();
        int i2 = 100;
        byte b2 = (byte)i2; // casting here because int is bigger than byte - EXPLICIT/MANUALLY
        System.out.println(i2);
        System.out.println(b2); // NO DATA LOSS because 100 is in bytes range


    }

}