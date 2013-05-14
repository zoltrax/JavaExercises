package com.javaexercises;

import java.util.concurrent.Semaphore;

public class Semaphores {

	private static int value = 0;
	/**
	 * @param args
	 */
	
	private final static Semaphore mutex = new Semaphore(1);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		try {
			 	            mutex.acquire();
			 	            value++;
			 	        } finally {
			 	            mutex.release();
			 	        }

				}

			}
