package StringQuiz;

public class Question1 {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta.replace('C', 'D');
        System.out.println(ta);


    }
}
