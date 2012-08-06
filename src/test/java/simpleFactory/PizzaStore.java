package simpleFactory;

import org.junit.Test;

import product.Pizza;

import factory.PizzaFactory;

public class PizzaStore {
	PizzaFactory factory;  
	public PizzaStore(PizzaFactory factory){
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) throws Exception{
		Pizza pizza = factory.createPizza(type);  
//		usually , factory statement a 'static' method to create the product....like this : 
//		Pizza pizza = PizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public static void main(String[] args) {  // use this to test.
		PizzaStore store = new PizzaStore(new PizzaFactory());
		try {
			store.orderPizza("cheese");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test(){  // Test class should have exactly one public zero-argument constructor;
		PizzaStore store = new PizzaStore(new PizzaFactory());
		try {
			store.orderPizza("cheese");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
