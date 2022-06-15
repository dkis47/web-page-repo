import java.util.Scanner;

public class Calc (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your first number? ");
	int a = sc.nextInt();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("What is your mathematical operator? ");
	String op = sc2.nextLine();
	
	Scanner sc3 = new Scanner(System.in);
	System.out.println("What is your second number? ");
	int b = sc3.nextInt();
	
	// int age = integer.parseInt(input); 
	// math.floor or math.ceil to round number correctly 
	// casting 
	if (op.equals("+")) {
		System.out.println("Result of your operation is : "+a+" + "+b+" = "+(a+b));
	}
	else if (op.equals("-")) {
		System.out.println("Result of your operation is : "+a+" - "+b+" = "+(a-b));
	}
	else if (op.equals("*")) {
		System.out.println("Result of your operation is : "+a+" * "+b+" = "+(a*b));
	}
	else if (op.equals("/")) {
		System.out.println("Result of your operation is : "+a+" / "+b+" = "+(a/b));
	}
	else if (op.equals("%")) {
		System.out.println("Result of your operation is : "+a+" % "+b+" = "+(a%b));
	}
	else if (op.equals("**")) {
		System.out.println("Result of your operation is : "+a+" ** "+b+" = "+(Math.pow(a, b)));
	}
	else {
		System.out.println("You didn't enter valid operation ");
	}
	
	

}
