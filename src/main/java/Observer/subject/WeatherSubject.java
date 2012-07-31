package subject;

import java.util.ArrayList;
import java.util.List;

import observer.IObserver;
import dto.Weather;

public class WeatherSubject implements ISubject {

	protected boolean changeFlag;
	protected List<IObserver> obs;
	
	private Weather weather;
	
	public WeatherSubject(){
		obs = new ArrayList<IObserver>();
		changeFlag = false;
	}
	
	
	/**
	 * regist observers.
	 * @param  observer  all implements Iobserver's subClasses
	 * @return regist success , return true; other opt return false;
	 */
	@Override
	public boolean registObserver(IObserver observer) {
		boolean flag = true;
		if(observer instanceof IObserver)
			obs.add(observer);
		else
			flag = false;
		return flag;
	}
	
	@Override
	public void remove(IObserver observer) {
		if(observer != null)
			obs.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		if(changeFlag){
			for(IObserver ob : obs){
				ob.update(this, this.weather);
			}
			changeFlag = false;
		}
	}

	@Override
	public void setChanged() {
		changeFlag = true;
	}
	
	
	public void setWeather(Weather weather){
		this.weather = weather;
		notifyObservers();
	}
	
	public Weather getWeather(){
		return this.weather;
	}
	
}
