import java.util.ArrayList;
import java.util.Iterator;

public class MovieGroup extends MovieComponent {

	ArrayList<MovieComponent> movieComponents;		// Can be either a movie or a group of movies.
	private String groupName;						// Name of the group.
	private String groupDescription;				// Group description.
	
	/**
	 * Can contain both movies and groups.
	 * @param groupName - name of the group.
	 * @param groupDescription - description of the group.
	 */
	public MovieGroup(String groupName, String groupDescription) {
		this.movieComponents = new ArrayList<MovieComponent>();
		this.setGroupName(groupName);
		this.setGroupDescription(groupDescription);
	}

	/**
	 * 
	 * @return name of the group.
	 */
	public String getGroupName() {
		return groupName;
	}

	/*
	 * Set the name of the group.
	 */
	private void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * 
	 * @return the description of the group.
	 */
	public String getGroupDescription() {
		return groupDescription;
	}

	/*
	 * set the description of the group.
	 */
	private void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
	
	@Override
	public void add(MovieComponent movieComponent) {
		this.movieComponents.add(movieComponent);
	}
	
	@Override
	public void remove(MovieComponent movieComponent) {
		this.movieComponents.remove(movieComponent);
	}
	
	@Override
	public MovieComponent getComponent(int index) {
		return (MovieComponent) this.movieComponents.get(index);
	}
	
	@Override
	public void info() {
		// Print info about this group.
		System.out.println("\n" + "group name: " + getGroupName() + ", description: " + getGroupDescription());
		
		/*
		 * Loop through every movie component in this group and call it's info method.
		 */
		Iterator<MovieComponent> itr = this.movieComponents.iterator();
		while(itr.hasNext()) {
			MovieComponent mc = (MovieComponent) itr.next();
			mc.info();
		}
	}
}
