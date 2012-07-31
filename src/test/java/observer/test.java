package observer;

import org.junit.Test;

import subject.WeatherSubject;
import dto.Weather;


public class test {
	
	private WeatherSubject subj = new WeatherSubject();
	
	@Test
	public void test(){
		Weather w3 = new Weather();
		w3.setBarometric(10.1f);
		w3.setHumidity(20.1f);
		w3.setTemperature(30.1f);
		Weather w2 = new Weather();
		w2.setBarometric(10.9f);
		w2.setHumidity(20.9f);
		w2.setTemperature(30.9f);
		Weather w1 = new Weather();
		w1.setBarometric(10.3f);
		w1.setHumidity(20.3f);
		w1.setTemperature(30.3f);
		
		
		Obs_1 obs1= new Obs_1(subj);
		new Obs_2(subj);
		
		
		subj.setChanged();
		subj.setWeather(w3);
		
		try {
			Thread.currentThread().sleep(3000);
			System.out.println("\n\n\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		subj.setChanged();
		subj.setWeather(w2);
		
		subj.remove(obs1);
		
		try {
			Thread.currentThread().sleep(1000);
			System.out.println("\n\n\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		subj.setChanged();
		subj.setWeather(w1);
		
		
		
	}
	
	

}
