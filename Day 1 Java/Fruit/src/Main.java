import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Price of which fruit are you interested in? ");
		String fr = sc.nextLine();

		switch (fr) {
		case "banana":
			System.out.println("price of " + fr + " is 10 £");
			break;

		case "apple":
			System.out.println("price of " + fr + " is 15 £");
			break;

		case "pineapple":
			System.out.println("price of " + fr + " is 12 £");
			break;

		case "kiwi":
			System.out.println("price of " + fr + " is 13 £");
			break;

		}
	}

}
