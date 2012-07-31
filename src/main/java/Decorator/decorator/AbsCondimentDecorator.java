package decorator;

import component.AbsBeverage;

public abstract class AbsCondimentDecorator extends AbsBeverage {

	@Override
	public abstract String getDescription();	
}
