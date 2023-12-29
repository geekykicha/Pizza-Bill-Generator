package com.PizzaHut.Pizza;

public class DeluxPizza extends Pizza{

	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}
// these 2 methods are override because for delux pizza addExtraCheese & addExtraToppings are pre-defined
	@Override
	public void addExtraCheese() {
	}

	@Override
	public void addExtraToppings() {
	}
	
}
