
/***
 * This will implemented in the ChatGrabber.
 * Used to register, unregister and notify observers.
 * @author iths
 *
 */
public interface Subject {
	/**
	 * This is used to register an observer, so it can be updated.
	 * @param o - the observer that will be added to the observer-list.
	 */
	public void register(Observer o);
	
	/**
	 * This is used to unregister an observer, so it can no longer be updated.
	 * @param o - the observer that will be removed from the observer-list.
	 */
	public void unregister(Observer o);
	
	/**
	 * Used to notify a change to all the registered observers.
	 */
	public void notifyObservers();
}
