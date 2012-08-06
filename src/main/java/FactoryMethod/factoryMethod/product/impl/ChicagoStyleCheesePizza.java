package factoryMethod.product.impl;

import factoryMethod.product.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		name = "Chicago style cheese pizza()";
		dough = "thick crust dough(厚皮比萨面团)";
		sauce = "tomato sauce";
		toppings.add("shredded mozzarella cheese(碎干酪)");
	}
	
	/**
	 * chicago 切法不同 , 可以override
	 */
	@Override
	public void cut() {
		System.out.println("芝加哥 pizza 的切法~~~~~");
	}
}
