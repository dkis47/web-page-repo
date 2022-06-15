
public class Character {
	String name, hairColor;
	int attack, defence, health, speed;

	
	// Constructor - same spelling as the same class
	Character(String name, String hairColor, int attack, int defence, int health, int speed){
	this.name=name;
	this.hairColor=hairColor;
	this.attack = attack;
	this.defence = defence;
	this.health = health;
	this.speed = speed;
	}
	Character(String name,int attack){
	this.name=name;
	this.attack=attack;
	}
	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public String getHairColor() {
		return hairColor;
	}

	



}
