
public class GoodGuy extends Character {
	private String catchphrase;
	
	public GoodGuy(String name, int health, String catchphrase) {
		super(name,health);
		this.catchphrase=catchphrase;
		
		
	}

	public String getCatchphrase() {
		return catchphrase;
	}

	public void setCatchphrase(String catchphrase) {
		this.catchphrase = catchphrase;
	}
	
	public void printInfo() {
		sys
	}

}
