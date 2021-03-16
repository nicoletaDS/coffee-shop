package coffeeshop;

import customers.Customer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<Customer> customers;
    private List<String> completedDrinks;

    public CoffeeAttendant() {
        customers = new ArrayList<>();
        completedDrinks = new ArrayList<>();
    }

    public void takeOrder(Customer customer) {
        customers.add(customer);
        System.out.println("Coffee Attendant: '" + customer.getName()
                + ", I've started working on your order of "
                + customer.getDrinkOrdered() + "'");
    }

    public void prepareDrink(String drinkToPrepare) {
        double timeTaken = Math.random() * 10;
        try {
            Thread.sleep((long) timeTaken * 100);
            completedDrinks.add(drinkToPrepare);
        } catch (InterruptedException e) {
            System.out.println("The drink could not be prepared.");
        }
    }

    public void callOutCompletedOrder(){
        for (String readyDrink : completedDrinks) {
            System.out.println("Order up: "  + readyDrink);
            for (Customer customer : customers) {
                customer.orderReady(readyDrink);
            }
        }
    }
}
