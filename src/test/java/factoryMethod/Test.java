package factoryMethod;


import factoryMethod.store.PizzaStore;
import factoryMethod.store.impl.ChicagoPizzaStore;
import factoryMethod.store.impl.NewYorkPizzaStore;

public class Test {
	
	@org.junit.Test
	public void test(){
		PizzaStore nyPizzaStore = new NewYorkPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		nyPizzaStore.orderPizza("cheese");
		chicagoPizzaStore.orderPizza("cheese");
	}
}
