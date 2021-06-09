package com.bzdgn.multi.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InitTest {
	
	@Test
	public void testGetInitMessage() {
		Init init = new Init();
		
		String expected = "Hello Dear User from the library!";
		String actual = init.getInitMessage();
		
		assertEquals(expected, actual);
	}

}
