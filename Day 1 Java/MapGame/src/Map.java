
public class Map {

	String Fin;
	int x, y, currentX, currentY;

	Map(String Fin, int x, int y, int currentX, int currentY){
		this.Fin=Fin;
		this.x=x;
		this.y=y;
		this.currentX=currentX;
		this.currentY=currentY;
		
	}

	public String getFin() {
		return Fin;
	}

	public void setFin(String fin) {
		Fin = fin;
	}

	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	

}
