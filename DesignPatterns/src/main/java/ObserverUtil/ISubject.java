/**
 * 
 */
package main.java.ObserverUtil;

/**
 * @author manjula
 *
 */
public interface ISubject {
	
	public void registerObserver(IObserver observer);
	public void unRegisterObserver(IObserver observer);
	public void notifyObserver();
	public Object getUpdate();

}
