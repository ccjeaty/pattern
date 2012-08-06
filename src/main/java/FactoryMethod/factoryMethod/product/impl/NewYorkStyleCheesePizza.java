package factoryMethod.product.impl;

import factoryMethod.product.Pizza;

public class NewYorkStyleCheesePizza extends Pizza {
	
	public NewYorkStyleCheesePizza(){
		name = "NewYork Cheese pizza~";
		dough = "thin crust dough(薄面团)"; 
		sauce = "Marinara sauce(番茄酱)";
		toppings.add("grated reggiano cheese (帕梅森乳酪 )");
	}
}
