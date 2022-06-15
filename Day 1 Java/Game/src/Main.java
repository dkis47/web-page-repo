
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Character mario = new Character("mario ", 10, " fdsafsa");
		Character luigi = new Character("Luigi ", 45, " fasdfas");
		System.out.println(mario.getHealth());

		Character bowser = new Character("Bowser",10);
		
		
		//insert get and set 
		mario.setHealth(9999);
		
		Generic gomba = new Generic("Goomba",3);
		gomba.printInfo();

		

	}

}
