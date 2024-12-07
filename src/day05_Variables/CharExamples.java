package day05_Variables;

public class CharExamples {
    public static void main(String[] args) {

        // declaring and initializing (assigning the first value)
        char letter1 = 'a'; //in ASCII table lower case a is 97
        char letter2 = 'Z'; // in ASCII capital case Z is 90
        char letter3 = '9';
        char letter4 = '%';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);

        System.out.println();
        System.out.println(letter1 + letter2); // 'a' + 'Z' ----> 97 + 90 = 187. Compiler treats each character as a number because each number as an assignment in ASCII table.
        System.out.println("" + letter1 + letter2); // everything after first string is Concatenation

        // Another way to declare char with numbers from ASCII / UNICODE table
        char letter5 = 84; // capital T
        System.out.println(letter5);
        char letter6 = 2345; // sanskirt letter
        System.out.println(letter6);
        // EVERY CHAR HAS A NUMBER ASSIGNED TO IT

        System.out.println();
        System.out.println(letter1 + letter2 + letter3 + letter4); //2281 --> because compiler is doing ADDITION
        System.out.println("Chars: " + letter1 + letter2 + letter3 + letter4); //Chars: aZ9% ---> because of Concatenation








    }
}

