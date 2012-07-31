package component.concrete;

import component.AbsBeverage;

public class EspressoCoffee extends AbsBeverage{
	
	public EspressoCoffee() {
		this.description = "Espresso Coffee~~";
	}
	
	@Override
	public float cost() {
		return 1.99f;
	}
}
