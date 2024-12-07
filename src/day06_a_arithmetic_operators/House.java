package day06_a_arithmetic_operators;
/*
    Create a class House
    create a main method

    - Each datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
public class House {
    public static void main(String[] args) {
        // we can declare same datatype variables in one STATEMENT
        String houseType = "Single House", address = "123 Test Dr, Fairfax, VA 22021";
        // We can declare and initalize (give the initial value) same datatype variables in ONE statement
        int numOfBedrooms =5, numOfKitchen = 2, zipCode = 12345;
        boolean hasBasement = true, hasAttic = false, hasPool = true, isForSale = true, hasNearbyPark = false;
        double numOfBathroom = 2.5, costOfHouse = 999_999.99, schoolRatings = 4.75; //999,999.99 = 999_999.99 in java

        /* I am  looking for $houseType which is located in $address $zipcode. It has $numOfBedroom and $numOfKitchen kitchen as well as $numOfBathroom bathroom. The cost of the house is
        $$costOfHouse.

        The house has following additional info:
            School Ratings:     $schoolRatings
            Has Basement:       $hasBasement
            Has Attic:          $hasAttic
            Has Pool            $hasPool
            Is For Sale:        $isForSale
            Has Nearby Park:    $hasNearbyPark


         */

        String result = "I am looking for " + houseType + " which is located in " + address + " " +  zipCode + "." + " It has " + numOfBedrooms + " bedrooms " + "and " + numOfKitchen + " kitchen as well as " + numOfBathroom + " bathrooms. The cost of the house is $" + costOfHouse + "\n\nThe house has the following additional info:\n\tSchool Ratings:\t\t" + schoolRatings + "\n\tHas Basement\t\t" + hasBasement + "\n\tHas Attic:\t\t\t" + hasAttic + "\n\tHas Pool:\t\t\t" + hasPool + "\n\tIs For Sale:\t\t" + isForSale + "\n\tHas Nearby Park:\t" + hasNearbyPark;
        System.out.println(result);
        System.out.println();
        System.out.println(result); //to print again, result.sout, benefit of re using the variables is that we do not have to re write the whole code again


    }






}

