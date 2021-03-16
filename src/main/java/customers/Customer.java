package customers;

import customers.WaitingCustomer;

public class Customer implements WaitingCustomer {

    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public String getName() {
        return this.name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public void orderReady(String preparedDrink) {
        if (drinkOrdered.equals(preparedDrink))
            existStore();
    }

    private void existStore() {
        System.out.println(name + ": Thank you, I've received my "
                + drinkOrdered + " and I'm leaving the store now...");
    }
}
