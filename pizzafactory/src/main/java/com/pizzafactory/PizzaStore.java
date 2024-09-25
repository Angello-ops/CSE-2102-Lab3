package com.pizzafactory;

public class PizzaStore {
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory factory) {
        this.pizzaFactory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Main method for executing the program
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        // Example pizza order
        System.out.println("Ordering a Cheese Pizza:");
        store.orderPizza("cheese");

        System.out.println("\nOrdering a Greek Pizza:");
        store.orderPizza("greek");
    }
}
