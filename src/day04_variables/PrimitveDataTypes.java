package day04_variables;


/*
    Data Types:
        1. Primitive
            A. Interger type
                -byte
                -short
                -int
                -long


            B. Floating type
                -float
                -double
            C. Single Characters
                -char
            D. true/false
                -boolean
         2. Non-Primitive
         * Sequence of chars-String


 */

public class PrimitveDataTypes {
    public static void main(String[] args) {

        byte age =34;              //: Declared a variable called age and datatype is byte and assigned a value 34;
        System.out.println("age"); //"age" is not a variable name. It is a value itself. It is of string data type
        System.out.println(age);  // age is a variable here. Datatype is--> byte
        System.out.println(34);   // 34 is a value and BY DEFAULT it is an int datatype because it is a whole number

        // byte b2 = 200; (will not work because bytes range is -128 to 127, exceeds)

        System.out.println("------");


        short year;         //declared a variable called year and data type is short
        year = 2024;        // we assigned a value of 2024 to the variable called year
        System.out.println(year); // year is a variable here. Datatype is short
        System.out.println(2024); // 2024 is a value and by DEFAULT whole numbers are int

        System.out.println("------");

        int ipNumber = 123456;  // declare a variable type called ipNumber and dataytype is int
        System.out.println(ipNumber); //ipNumber is a variable and datatype is int
        System.out.println(123456);   // 123456 is a value and BY DEFAULT whole numbers are int.

        long accNumber = 1234567812345678L;
        System.out.println(accNumber); // Declared a variavle called accNumber and datatype is long and assigned a value directly with having "L" or "l" at the end of the value
        System.out.println(1234567812345678L);

    }
}
