package com.nisum.thread;

/**<h1>MyThread</h1>
 * this is the extended version of Thread class that 
 * would print a countdown from 5 to 0 
 * @author mwasif
 *@see Thread
 */
public class MyThread extends Thread {
	private String threadName;
	/**A constructor of Mythread that set the name 
	 * of thread and report its creation
	 * @param name is the name of the thread in String format
	 */
	MyThread(String name){
		threadName = name;
		System.out.println("Creating" + threadName);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run(){
		System.out.println("Currently running :" + threadName);
		try{for(int x = 5; x>0;x--){
		System.out.println(x);
		Thread.sleep(1000);
		}}catch(Exception e){e.printStackTrace();}
		
	}
	
	/**This main program creates two threads and one main thread(by default)
	 * the use of join() method is used to restict main method from ending 
	 * 
	 */
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
