package StringQuiz;

public class Question5 {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "" + s1.charAt(0) + s1.charAt(s1.length());
        System.out.println(s2);
    }
}
