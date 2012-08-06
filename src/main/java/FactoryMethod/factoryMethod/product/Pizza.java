package factoryMethod.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	protected String name;
	/**面团*/
	protected String dough;
	/**酱料*/
	protected String sauce;
	/**装饰配料*/
	protected List<String> toppings = new ArrayList<String>();
	
	
	public void prepare(){
		System.out.println("prepareing " + name);
		System.out.println("\ttossing dough.....");
		System.out.println("\tadding sauce " + sauce);
		System.out.print("\tadding toppings : ");
		for(String topping : toppings){
			System.out.print(" #" + topping);
		}
		System.out.println("\n>>>>finished prepare/.>>>>>>");
	}
	
	/**
	 * 烘烤
	 */
	public void bake(){
		System.out.println("bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println("cutting " + this.name);
	}
	
	public void box(){
		System.out.println("");
	}
	
	public String getName(){
		return this.name;
	}
	

}
