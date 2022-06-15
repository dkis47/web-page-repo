
public class Character {
	private String name;
	private int health;
	
	
	// Constructor - same spelling as the same class
	Character(String passedName, int health){
	this.name=passedName;
	this.health = health;

	

}	//Second Constructor
	Character (String name, int health){
		this.name =name;
		this.health = health;
		
	}
	
	Character(){
		
	}
}