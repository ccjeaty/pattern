package decorator;

import org.junit.Test;

import component.AbsBeverage;
import component.concrete.DecafCoffee;
import component.concrete.EspressoCoffee;

import decorator.concrete.Milk;
import decorator.concrete.Mocha;

public class test {
	
	@Test
	public void test(){
		
		AbsBeverage decaf = new DecafCoffee();
		
		Milk milk = new Milk(decaf);
		
		
		System.out.println(milk.getDescription());
		
		
//		Assert.assertEquals(milk.cost(), 1.15);
		System.out.println(milk.cost());
		System.out.println("\n\n");
	}
	
	@Test
	public void test1(){
		AbsBeverage beverage = new EspressoCoffee();
		
		//双倍摩卡牛奶浓缩coffee
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Milk(beverage);
		
		System.out.print(beverage.getDescription());
		System.out.print(" $");
		System.out.println(beverage.cost());
		System.out.println("\n\n");
		
	}
	
	
	
}
