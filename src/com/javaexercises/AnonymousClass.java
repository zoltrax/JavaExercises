package com.javaexercises;

public class AnonymousClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// anonymous class
		
		new Thread(new Runnable() {
		    public void run()
		    {
		        // do stuff
		    }
		}).start();
	
	}
	
	public int f1(){
		return 0;
	}
	
	public int f2(){
		return 0;
	}
	
	

}
