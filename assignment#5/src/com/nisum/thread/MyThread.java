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
		try{for(int count = 5; count>0;count--){
		System.out.println(count);
		Thread.sleep(1000);
		}}catch(Exception exception){exception.printStackTrace();}
		
	}
	

}
