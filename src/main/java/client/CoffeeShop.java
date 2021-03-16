package client;

import coffeeshop.CoffeeAttendant;
import customers.Customer;

public class CoffeeShop {
    public static void main(String[] args) {

        Customer john = new Customer("John", "banana milkshake");
        Customer sara = new Customer("Sara", "Green Tee");

        CoffeeAttendant attendant = new CoffeeAttendant();

        // take order
        attendant.takeOrder(john);
        attendant.takeOrder(sara);

        // prepare drink
        attendant.prepareDrink(john.getDrinkOrdered());
        attendant.prepareDrink(sara.getDrinkOrdered());

        // order up...
        attendant.callOutCompletedOrder();

    }
}
