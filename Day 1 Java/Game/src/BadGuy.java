
public class BadGuy extends Character {
	String getawayVehicle;
	
	public BadGuy(String name, int health, String getawayVehicle) {
		super(name,health);
		this.getawayVehicle=getawayVehicle;
	}

	public String getGetawayVehicle() {
		return getawayVehicle;
	}

	public void setGetawayVehicle(String getawayVehicle) {
		this.getawayVehicle = getawayVehicle;
	}

}
