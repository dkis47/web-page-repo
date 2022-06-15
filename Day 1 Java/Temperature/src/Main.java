import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		int temp = scan.nextInt();
		
		
		if (temp>=20) {
			System.out.println("it is hot today");
			
		}
		else if (temp>35) {
			System.out.println("Seek a cool shaded place");
		}
		else  {
		System.out.println("it is not very hot");
	}

}
}