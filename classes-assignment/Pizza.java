import java.util.Scanner;

public class Pizza {
    public Scanner input = new Scanner(System.in);

    private int pizzaSize;
    private int toppings;
    private int drinks;
    private int drinkSize;
    private int deliveryMethod;
    private int totalCost;

    public void orderPizza() {
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

    public void computeCost() {
        totalCost = 0;
        totalCost += pizzaSize * 10;
        totalCost += toppings * 2;
        totalCost += drinks * drinkSize * 2;
        totalCost += deliveryMethod * 3;

        System.out.println("The total cost of the Pizza is: " + totalCost);
    }
}