package com.javaexercises;

public class GenericBoundedTypeEx<T> {
 
	public T max = null;
	
	/**
	 * @param args
	 */
	public T maximum(T x, T y, T z){
		
		max = x;
		
		//if(y.compareTo(max) > 0){ max = y; }
		//if(z.compareTo(max) > 0){ max = z; }
		
		
		
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(maximum("a", "ab", "b"));

	}

}
