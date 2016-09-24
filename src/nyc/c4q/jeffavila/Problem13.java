package nyc.c4q.jeffavila;

import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {
        iceCream();
    }

    public static void iceCream () {
        double totalCost = 0;
        double baseCost = 2.33;
        double costPerTopping = .33;
        int numOfToppings = 0;
        String flavor;

        System.out.println("Hi! What's your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ok " + scanner.nextLine() + ", which flavor of ice cream would you like?");
        scanner = new Scanner(System.in);
        flavor = scanner.nextLine();

        System.out.println("Would you like chocolate chips?");
        scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("yes"))
            numOfToppings++;

        System.out.println("Would you like sprinkles?");
        scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("yes"))
            numOfToppings++;

        System.out.println("Would you like cherries on top?");
        scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("yes"))
            numOfToppings++;

        totalCost = baseCost + (costPerTopping * numOfToppings);
        int deliveryTime = (int)(Math.random() * 59) + 1;

        System.out.println("Okay! A " + flavor + " ice cream with " + numOfToppings + " toppings. " +
                "Your total is $" + totalCost + " and your ice cream will arrive in " + deliveryTime + " minutes.\n");
    }
}