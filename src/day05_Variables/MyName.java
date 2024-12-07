package day05_Variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'S';
        char letter2 = 'a';
        char letter3 = 'm';
        char letter4 = 'm';
        char letter5 = 'y';

        System.out.println(letter1); //prints itself
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);

        //Addition
        System.out.println();
        System.out.println(0 + letter1);
        System.out.println(0 + letter2);
        System.out.println(0 + letter3);
        System.out.println(0 + letter4);
        System.out.println(0 + letter5);

        System.out.println();


        // ADDITION
        System.out.println(letter1 + letter2 + letter3 + letter4 + letter5); //int

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5; // string, why blank space is useful, concatnates everything into my name
        System.out.println(myName);


    }
}
