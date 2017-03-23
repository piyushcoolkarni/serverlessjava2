package testexample;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

import example.Hello;

public class TestHello 
{
	@Test
	public void testMyHandler()
	{
		Hello hello = new Hello();
		Context ctx = null;
		String output = hello.myHandler(20, ctx);
		Assert.assertEquals("Temperature in Farenhite68", output);
	}
}
