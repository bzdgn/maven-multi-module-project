package com.bzdgn.multi.main;

public class App {
	public static void main(String[] args) {
		Init init = new Init();
		
		String initMessage = init.getInitMessage();
		System.out.println(initMessage);
	}
}
