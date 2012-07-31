package subject;

import observer.IObserver;

public interface ISubject {
	
	boolean registObserver(IObserver observer);
	
	void remove(IObserver observer);
	
	void notifyObservers();
	
	void setChanged();

}
