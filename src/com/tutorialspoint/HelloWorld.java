package com.tutorialspoint;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println( "Your message : "+message);
	}

	public void setMessage(String message) {
		this.message = message+"\n";
	}
	
	public void init(){
		System.out.println("Bean is going through init.");
	}
	
	public void destruct(){
		System.out.println("Bean will destroy now.");
	}
	
}
