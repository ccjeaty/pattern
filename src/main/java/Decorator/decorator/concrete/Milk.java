package decorator.concrete;

import component.AbsBeverage;

import decorator.AbsCondimentDecorator;

public class Milk extends AbsCondimentDecorator {
	
	AbsBeverage beverage;
	
	public Milk(AbsBeverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription().concat(", with milk~ nice!");
	}

	@Override
	public float cost() {
		return this.beverage.cost() + .10f;
	}

}
