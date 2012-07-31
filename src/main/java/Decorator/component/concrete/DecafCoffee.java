package component.concrete;

import component.AbsBeverage;

public class DecafCoffee extends AbsBeverage {
	
	public DecafCoffee() {
		this.description = "decof coffee~";
	}
			
	@Override
	public float cost() {
		return 1.05f;
	}
}
