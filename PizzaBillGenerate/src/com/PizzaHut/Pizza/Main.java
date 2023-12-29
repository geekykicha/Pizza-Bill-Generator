package com.PizzaHut.Pizza;


public class Main {

	public static void main(String[] args) {
		
		// for base pizza 
		
//		Pizza basePizza = new Pizza(true);
//		basePizza.addExtraCheese();
//		basePizza.addExtraToppings();
//		basePizza.takeAway();
//		basePizza.getBill();
		
		// for delux pizza
		
		DeluxPizza dp = new DeluxPizza(true);
		dp.addExtraCheese();
		dp.addExtraToppings();
		dp.takeAway();
		dp.getBill();

	}
}
