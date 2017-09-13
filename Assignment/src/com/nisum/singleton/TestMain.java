package com.nisum.singleton;

/**
 * This main class is implemented to test Singleton Class
 */

public class TestMain {
	/**
	 * client want singleton multiple times and gets the same instance
	 */
	public static void main(String[] args) {
		for(int access=0; access<5; access++){
		Singleton singleton = Singleton.getSingleton();
		System.out.println(singleton);
		}
		

	}

}
