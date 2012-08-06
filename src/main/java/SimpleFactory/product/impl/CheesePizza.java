package product.impl;

import product.Pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare cheese pizza!");
	}

}
