package factory;

import product.Pizza;
import product.impl.CheesePizza;
import product.impl.ViggiePizza;

public class PizzaFactory {
	
	public Pizza createPizza(String type) throws Exception{
		Pizza pizza = null;
		if(null == type || type.equals("")){
			throw new Exception("type is empty!");
		}else{
			if(type.equals("viggie"))
				pizza = new ViggiePizza();
			if(type.equals("cheese"))
				pizza = new CheesePizza();
		}
		
		if(pizza == null){
			throw new Exception("pizza type not found : [".concat(type).concat("]"));
		}
		return pizza;
	}

}
