package observer;

import subject.ISubject;
import dto.Weather;

public class Obs_1 implements IObserver{
	
	
	public Obs_1(ISubject subj){
		subj.registObserver(this);
	}
	
	@Override
	public void update(ISubject subj, Weather weather) {
		System.out.println("Obs_1.update()~~~");
		System.out.println(weather);
	}

}
