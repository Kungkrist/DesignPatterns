
public class Main {

	public static void main(String[] args) {
		
		// Create a ChatGrabber that will update every observer connected to this grabber.
		ChatGrabber grabber = new ChatGrabber();
		
		// Create the first Observer (Could be a user, etc...)
		ChatObserver o1 = new ChatObserver(grabber);
		
		// Append a message that will be sent to all the observers.
		grabber.appendToMessage("Hej");
		
		grabber.appendToMessage("På");
		ChatObserver o2 = new ChatObserver(grabber);
		grabber.appendToMessage("Dig");
	}

}
