package observer;

import subject.ISubject;
import dto.Weather;

public interface IObserver {
	void update(ISubject subj, Weather weather);
}
