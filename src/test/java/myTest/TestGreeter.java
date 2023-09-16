package myTest;

import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import myPractice.Greeter;

public class TestGreeter {

	private Greeter greeter;
	
	@Before
	public void setup()
	{
		greeter = new Greeter();
	}
	
	@Test
	public void GreeterShowIdIncludeTheOneBeingGreeted()
	{
		String someone	= "World";
		Assert.assertEquals(greeter.Greet(someone), someone);
	}

	@Test
	public void GreeterShowIdIncludeGreetingPhrase()
	{
		String someone	= "World";
		Assert.assertNotEquals(greeter.Greet(someone).length(), someone.length());
	}

	@Test
	public void GreeterShowIdIncludeGreetingMessage()
	{
		String someone	= "World, Thank you making me happy!";
		Assert.assertNotSame(greeter.Greet(someone), someone.contains(someone));
	}
}

