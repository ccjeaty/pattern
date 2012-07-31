package observer;

import subject.ISubject;
import dto.Weather;

public class Obs_2 implements IObserver{
	
	
	public Obs_2(ISubject subj){
		subj.registObserver(this);
	}
	
	@Override
	public void update(ISubject subj, Weather weather) {
		System.out.println("Obs_2.update()~~~~~~~~~~");
		System.out.println(weather);
	}

}
