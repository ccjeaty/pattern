package factoryMethod.store.impl;

import factoryMethod.product.Pizza;
import factoryMethod.product.impl.ChicagoStyleCheesePizza;
import factoryMethod.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if("cheese".equals(type))
			pizza = new ChicagoStyleCheesePizza();
		
		return pizza;
	}

}
