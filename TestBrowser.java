package com.xworkz.browser;

public class TestBrowser {

	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.setName("google");
		System.out.println("browser name is " + browser.getName());
		FirefoxBrowser firefoxBrowser = new FirefoxBrowser();
		firefoxBrowser.setName("Firefox");
		firefoxBrowser.setSpeed(100);
		System.out.println("browser name is " + firefoxBrowser.getName());
		System.out.println("browser speed is " + firefoxBrowser.getSpeed());
		
		
		
		
	
	}
	

}
