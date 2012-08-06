package factoryMethod.store.impl;

import factoryMethod.product.Pizza;
import factoryMethod.product.impl.NewYorkStyleCheesePizza;
import factoryMethod.store.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if("cheese".equals(type))
			pizza = new NewYorkStyleCheesePizza();
		
		return pizza;
	}

}
