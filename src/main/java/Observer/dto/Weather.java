package dto;

public class Weather {
	
	/** 温度 */
	private Float temperature;
	
	/** 湿度 */
	private Float humidity;
	
	/** 气压 */
	private Float barometric;
	
	
	

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public Float getHumidity() {
		return humidity;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}

	public Float getBarometric() {
		return barometric;
	}

	public void setBarometric(Float barometric) {
		this.barometric = barometric;
	}
	
	@Override
	public String toString() {
		return this.getBarometric() + " " + this.getHumidity() + " " + this.getTemperature();
	}
	
}
