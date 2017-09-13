package com.nisum.thread;
/**This main program creates two threads and one main thread(by default)
 * the use of join() method is used to restrict main method from ending 
 * @author mwasif
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.print(" main thread starting");
		MyThread thread2 = new MyThread("Thread-1");
		MyThread thread3 = new MyThread("Thread-2");
		
		thread2.start();
		thread3.start();
	
		try{
		thread2.join();
		thread3.join();
		}catch(Exception exception){exception.printStackTrace();}

		System.out.println("Main thread ending");
		}

}
