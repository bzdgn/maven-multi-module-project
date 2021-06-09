package com.bzdgn.multi.library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreeterTest {
	
	@Test
	public void testGreet() {
		String name = "github";
		
		String expected = "Hello " + name + " from the library!";
		String actual = Greeter.greet(name);
		
		assertEquals(expected, actual);
	}
	
}
