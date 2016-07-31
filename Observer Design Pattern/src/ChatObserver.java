/***
 * This class is used to receive updates from the ChatGrabber class.
 * @author iths
 *
 */
public class ChatObserver implements Observer{

	private String message = "";		// The message that will be received at every update.
	private ChatGrabber chatGrabber;	// The ChatGrabber that contains this observer.
	
	private static long idCount;		// The amount of created observer.
	private long observerId;			// Unique id for every observer.
	
	/***
	 * 
	 * @param chatGrabber - the ChatGrabber that this observer will be stored in.
	 */
	public ChatObserver(ChatGrabber chatGrabber) {
		this.chatGrabber = chatGrabber;
		
		// Set the unique id for this observer.
		this.observerId = ++idCount;
		
		// Register this observer to the ChatGrabber.
		this.chatGrabber.register(this);
	}
	
	@Override
	public void update(String message) {
		this.message = message;
		this.printMessage();
	}
	
	/**
	 * Print the current stored message.
	 */
	public void printMessage() {
		System.out.println(this.observerId + ": " + this.message);
	}

}
