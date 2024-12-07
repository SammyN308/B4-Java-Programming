package day09_a_scanner;
/*
    Task
        declare and assign
            is it the weekend
            are you a teacher
            are you a police officer
            are you a firefighter

         Do you get a discount?
            Must be a weekend and you must be one of the given professions
 */

public class Discount {
    public static void main(String[] args) {
        //boolean isWeekend, isTeacher, isOfficer, isFireFighter
        // boolean isWeekend = false, isTeacher = false, isOfficer = true, isFireFighter = false;
        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFireFighter = true;


        boolean isEligibleForDiscount = isWeekend && isTeacher || isOfficer || isFireFighter;
        //                              false && ( false || true || false || false)
        //                                   false && (  true || false   || false )
        //                                          true &&      (   true   )
        //                                                  true

        System.out.println("Is eligible for discount " +isEligibleForDiscount);

    }
}
