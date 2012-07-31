package component;

public abstract class AbsBeverage {
	
	protected String description = new String("!!Unknow Beverage");
	
	public String getDescription(){
		return this.description;
	}
	
	public abstract float cost();

}
