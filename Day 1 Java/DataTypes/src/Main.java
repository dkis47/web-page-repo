
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Non-primitive data types - comes from a class
		String name = "Danijel";
		System.out.println("Hello " + name);

		// Sysout shortcut ctrl+space
		// ctrl+F11 to start the code

		// primitive data types - do not come from a class

		int age = 42;

		boolean a = true;
		boolean b = false;
		char c = 'p';
		char d = '1';
		byte[] a1 = { 1, 2, 3 };

		// string is an array of characters
		System.out.println(a1);
		System.out.println(name.length());
		System.out.println(name.toUpperCase());

		int i; // instantiaton
		i = 10; // initalisation

		int x, y, z;
		x = y = z = 3;

		String sentence = "Hello " + name;
		System.out.println(sentence);

		System.out.println(name);

		// increment decrement

		int h = 10;
		h += 5;
		h *= 10;
		h /= 5;
		System.out.println(h);

		boolean raining = true;

		if (!raining) {
			System.out.println("You need to take an umbrella");

		} else {
			System.out.println("You dont need an umbrella");
		}

	}

}
