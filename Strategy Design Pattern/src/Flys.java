
// Used in the pattern-design. 
public interface Flys {
	public String itFlyes();
}

//Used in the pattern-design. 
 class ItCanFly implements Flys{

	@Override
	public String itFlyes() {
		return "Flying high!";
	}
	
}
 
//Used in the pattern-design. 
 class ItCannotFly implements Flys {

	@Override
	public String itFlyes() {
		return "Cannot fly :(";
	}
	 
 }
