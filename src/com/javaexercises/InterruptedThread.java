package com.javaexercises;

public class InterruptedThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new WaitRunnable());
		
		thread1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
				}
		
		thread1.interrupt();
	}

	private static class WaitRunnable implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("czas: " + System.currentTimeMillis());
			
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				System.out.println("Watek zatrzymany: " + Thread.currentThread().isInterrupted());
			}
			
			System.out.println("czas: " + System.currentTimeMillis());
			
		}
		
		
	}
	
	
}
