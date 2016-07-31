import java.util.ArrayList;

/**
 * This class is used to store observers & send messages to all of them.
 * @author iths
 *
 */
public class ChatGrabber implements Subject{

	private ArrayList<Observer> observers;	// List of observers.
	private String message = "";			// The message that will be updated & sent to all the observers.
	
	public ChatGrabber() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer o) {
		this.observers.add(o);		
	}

	@Override
	public void unregister(Observer o) {
		int index = this.observers.indexOf(o);
		this.observers.remove(index);		
	}

	@Override
	public void notifyObservers() {
		for(Observer o : this.observers) {
			o.update(message);
		}		
	}
	
	/**
	 * Append a new row to the message.
	 * @param message
	 */
	public void appendToMessage(String message) {
		
		// Append the new row.
		this.message += message + "\n";
		
		// Notify all the observers of the change in the message.
		this.notifyObservers();
	}

}
