package com.bzdgn.multi.main;

import com.bzdgn.multi.library.Greeter;

public class Init {
	
	public String getInitMessage() {
		String message = Greeter.greet("Dear User");
		
		return message;
	}

}
