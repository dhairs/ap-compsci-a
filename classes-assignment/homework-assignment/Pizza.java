import java.util.Scanner;

public class Pizza {

    // Define all the public class variables (literally just scanner)
    public Scanner input = new Scanner(System.in);

    // Define all the private class variables (literally just the variables for the
    // pizza)
    private int pizzaSize;
    private int toppings;
    private int drinks;
    private int drinkSize;
    private int deliveryMethod;
    private int totalCost;

    // Create a method for the order pizza, will ask user for details on the order
    public void orderPizza() {

        // Ask all pizza/drink/delivery details and add to the class variables
        System.out.println("Enter a pizza size (1 for small, 2 for medium, 3 for large)");
        pizzaSize = input.nextInt();
        System.out.println("Enter the number of toppings");
        toppings = input.nextInt();
        System.out.println("Enter the number of drinks");
        drinks = input.nextInt();
        System.out.println("Enter the size of the drinks (1 for small, 2 for medium, 3 for large)");
        drinkSize = input.nextInt();
        System.out.println("Enter the delivery method (1 for dine-in, 2 for pickup, 3 for delivery)");
        deliveryMethod = input.nextInt();

    }

    // create a method for the cost computing, will compute the cost of the pizza
    public void computeCost() {

        // abritrary cost of each pizza size/topping/drink/delivery method
        totalCost = 0;
        totalCost += pizzaSize * 10;
        totalCost += toppings * 2;
        totalCost += drinks * drinkSize * 2;
        totalCost += deliveryMethod * 3;

        // Print out the cost to the user

        System.out.println("The total cost of the Pizza is: " + totalCost);
    }
}