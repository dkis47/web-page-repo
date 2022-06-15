import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner text = new Scanner(System.in);
		System.out.println("Enter the text to check if its pangram: ");
		String check = text.nextLine();
		 String i = check.toLowerCase();
	        if	(i.contains("a") 
	        		&& i.contains("b")
	        		&& i.contains("c") 
	        		&& i.contains("d")
	                && i.contains("e")
	                && i.contains("f") 
	                && i.contains("g")
	                && i.contains("h") 
	                && i.contains("i")
	                && i.contains("j")
	                && i.contains("k") 
	                && i.contains("l") 
	                && i.contains("m")
	                && i.contains("n") 
	                && i.contains("o") 
	                && i.contains("p")
	                && i.contains("q")
	                && i.contains("r") 
	                && i.contains("s")
	                && i.contains("t") 
	                && i.contains("u") 
	                && i.contains("v")
	                && i.contains("w")
	                && i.contains("x")
	                && i.contains("y")
	                && i.contains("z")){
	            System.out.println("Sentence is Pangram");;
	        }else{
	            System.out.println("Sentence is not Pangram");;
		
		
		
		

	}

}}
