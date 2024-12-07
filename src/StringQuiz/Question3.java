package StringQuiz;

public class Question3 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = new String("Java");
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}


