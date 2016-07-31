/**
 * This will be implemented in the ChatObserver class.
 * @author iths
 *
 */
public interface Observer {
	/**
	 * Used to update a message for a observer.
	 * @param message - the message that will be sent to the specified observer.
	 */
	public void update(String message);
}
