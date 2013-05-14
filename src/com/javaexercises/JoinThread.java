package com.javaexercises;

public class JoinThread {
	
	


	public static void main(String[] args){
		Thread thread2 = new Thread(new WaitRunnable());
		Thread thread3 = new Thread(new WaitRunnable());
		
		System.out.println("Current time milis: " + System.currentTimeMillis());
		
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		
		System.out.println("Current time milis: " + System.currentTimeMillis());
		thread3.start();
		//thread3.setPriority(7);
		java.lang.System.out.println("Priority of thread 3: "+thread3.getPriority());
		
		try{ 
			thread3.join(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Current time milis: " + System.currentTimeMillis());
		System.out.println("min priority: " + Thread.MIN_PRIORITY);
		System.out.println("min priority: " + Thread.MAX_PRIORITY);
		System.out.println("min priority: " + Thread.NORM_PRIORITY);
	}
	
	
 private static class WaitRunnable implements Runnable{
	 
	 public void run(){
		 try {
			 
			 for(int i = 0; i<5 ; i++){
			 //Thread.sleep(5000);
			if((i%5) == 0){  
				System.out.println(Thread.currentThread().getName());	 
				Thread.yield();
			
			}
			}
			 System.out.println(Thread.currentThread().getName() + " has finished executing.");
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 
 }

}
