package com.syntax.class02;

public class SFireFoxDriver implements SWebDriver {
	
	public SFireFoxDriver() {
		System.err.println("Opening FirefoxD Driver ...");
	}

	@Override
	public void get(String url) {
		System.out.println("Lunching the url:: "+url);
		
	}

	@Override
	public void getCurrentUrl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
