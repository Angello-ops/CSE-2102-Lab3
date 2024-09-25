package com.pizzafactory;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaStoreTest {

    private PizzaStore store;

    @Before
    public void setUp() {
        PizzaFactory factory = new PizzaFactory();
        store = new PizzaStore(factory);
    }

    @Test
    public void testOrderCheesePizza() {
        Pizza pizza = store.orderPizza("cheese");
        assertNotNull(pizza);
        assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void testOrderGreekPizza() {
        Pizza pizza = store.orderPizza("greek");
        assertNotNull(pizza);
        assertTrue(pizza instanceof GreekPizza);
    }

    @Test
    public void testOrderPepperoniPizza() {
        Pizza pizza = store.orderPizza("pepperoni");
        assertNotNull(pizza);
        assertTrue(pizza instanceof PepperoniPizza);
    }

    @Test
    public void testOrderGlutenFreePizza() {
        Pizza pizza = store.orderPizza("glutenfree");
        assertNotNull(pizza);
        assertTrue(pizza instanceof GlutenFreePizza);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPizzaOrder() {
        store.orderPizza("unknown");
    }
}
