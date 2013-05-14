package com.javaexercises;

public class MainClass {

	/**
	 * @param string
	 */
	
	private static int count = 0;
	
	public synchronized int getCount(){
		return count;
	}
	
	public synchronized void setCount(int count){
	    this.count = count;
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		for(String s:args){
	
			System.out.println(s);
		}
	//	System.out.println(string[0]);
		/*
		MainClass object = new MainClass();
		object.setCount(4);
		MainClass objectix = new MainClass();
		objectix.setCount(2);
		System.out.println(objectix.getCount());
		System.out.println(object.getCount());
		
		*/
		
		Singleton istance = new Singleton();
		istance.getInstance();
		istance.getInstance();
		

	}

}
