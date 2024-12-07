package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        //type of pizza, the number of slices, the number of people eating
        String pizzatype = "Pepperoni";
        int numOfSlices =  10;
        int numOfPeople = 3;

        int slicesForEachPerson = numOfSlices / numOfPeople;
        //int slicesLeftOver = numOfSlices - (numOfPeople * slicesForEachPerson); another way of doing it
        int slicesLeftOver = numOfSlices % numOfPeople;

        System.out.println(slicesLeftOver);

        String result = "We bought " + pizzatype + "pizza. It has " + numOfSlices + " slices. We are " + numOfPeople + " people and each of us will eat " + slicesForEachPerson + " slices and there will be " + slicesLeftOver + " slices left over. ";
        System.out.println(result);
    }
}
