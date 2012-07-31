package decorator.concrete;

import component.AbsBeverage;

import decorator.AbsCondimentDecorator;

public class Mocha extends AbsCondimentDecorator {
	
	AbsBeverage beverage;
	
	public Mocha(AbsBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription().concat(", Mocha!");
	}

	@Override
	public float cost() {
		return beverage.cost() + .20f;
	}

}
