package com.nisum.singleton;

/**
 * <h1>Singleton design pattern</h1> This program implements the singleton
 * Design pattern
 * <p>
 * this program makes the singleton object on request and then return the same
 * object
 * <p>
 * it is based on lazy instantiation
 * 
 * @author mwasif
 */

public class Singleton {

	/**
	 * <h3>Static member</h3> It gets memory only once because of static, it
	 * contains the instance of the Singleton class
	 * <p>
	 * initially it is kept null as per lazy instantiation
	 */
	public static Singleton singleton = null;

	/**
	 * private constructor to prevent others from classes making instance
	 */
	private Singleton() {
	}

	/**
	 * a static method that creates the singleton on first request and return
	 * the already produced singleton
	 * 
	 * @return Singleton object
	 */
	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	/**
	 * This method is used to print singleton address on console
	 */
	public void printSingleton() {
		System.out.println("inside the singleton class");
	}

}
