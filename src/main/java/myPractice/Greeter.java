package myPractice;

public class Greeter {
	
	public Greeter()
	{
		
	}
	
	public String Greet(String name)
	{
		System.out.println("Hello!!! Mr. "+ name);
		return String.format("Hello Mr. "+ name);
	}

	public static void main(String[] args) {
		
		System.out.println("Hello from main method....");

	}

}
