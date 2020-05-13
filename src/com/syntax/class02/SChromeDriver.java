package com.syntax.class02;

public class SChromeDriver implements SWebDriver{
	
	public SChromeDriver() {
		System.err.println("Opening Chrome Browser...");
	}

	@Override
	public void get(String url) {
		System.out.println("Lunching the url:: "+url );
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Get current URL : ");
	}

	@Override
	public void close() {
		System.out.println("Clousing the current window");
	}

	@Override
	public void getTitle() {
	System.out.println("Get current title");
	}
}
