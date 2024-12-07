package day03_comments_escape_sequence;

public class TabandNextLine {
    public static void main(String[] args) {

        // explanation of spaces
        System.out.println("A sentence");     // has not spaces
        System.out.println(" A sentence");    // has 1 space at beginning
        System.out.println("  A sentence");   // has 2 spaces at the beginning
        System.out.println("   A sentence");  // has 3 spaces at the beginning
        System.out.println("    A sentence"); // has 4 spaces at the beginning

        // Now, I will use tab to do 4 spaces at one ----> \t equals to 4 spaces
        System.out.println("\tA sentence");

        // Lets put 2 tabs
        System.out.println("        A sentence");
        System.out.println("\t\tA sentence");

        System.out.println();

        //This is explaining New Line (\n
        System.out.println("1) Unlock the car door");
        System.out.println("2) Get into the car");
        System.out.println("3) Start the car");

        System.out.println();
        System.out.println("1)Unlock the car door\n2)get into the car\n3)start the car");

        System.out.println();

        System.out.println("Week days: Monday Tuesday Wednesday Thursday Friday Saturday Sunday");
        /*
        Week Days
             Monday
             Tuesday
             .
             .
             .
             Sunday
         */
        System.out.println("Week days: \nMonday \nTuesday \nWednesday \nThursday \nFriday \nSaturday \nSunday");
        System.out.println("Week days: \n\tMonday\n\tTuesday\n\tWednesday\n\tThursday\n\tFriday\n\tSaturday\n\tSunday");

        System.out.println();
        System.out.println("Week Days:\n    Monday\n    Tuesday\n\tWednesday\n\tThursday\n\tFriday\n\tSaturday\n\tSunday");


    }
}