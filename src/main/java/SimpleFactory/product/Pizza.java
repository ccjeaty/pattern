package product;

public abstract class Pizza {
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("bakeing/.>>>");
	}
	
	public void cut(){
		System.out.println("cuting pizzza/.>>>>");
	}
	
	public void box(){
		System.out.println("boxing  .....");
	}
}
