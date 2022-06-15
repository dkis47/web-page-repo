
public class AnotherJavaFile {
	String name="Dan";
	int age=21;
	
	
	public void hoOld() {
		System.out.println(name+ " is " +age + " years old");
	}
	
	public void sayHello(String name) {
		System.out.println(name);
	}
	public int howLong(int age) {
		System.out.println("You can retire in "+(65-age)+ " years");
		return (65-age);
	}
}
