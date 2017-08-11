public class multithreading extends Thread {
	//private Thread t;
	private String tname;
	multithreading(String name){
		tname = name;
		System.out.println("Creating" + tname);
	}
	
	public void run(){
		System.out.println("Currently running :" + tname);
		try{for(int x = 5; x>0;x--){
		System.out.println(x);
		Thread.sleep(1000);
		}}catch(Exception e){e.printStackTrace();}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" main thread starting");
		multithreading t2 = new multithreading("Thread-1");
		multithreading t3 = new multithreading("Thread-2");
		
		t2.start();
		t3.start();
	
		try{
		t2.join();
		t3.join();
		}catch(Exception e){e.printStackTrace();}
		
		

		System.out.println("Main thread ending");
		
		//t1.start();
		
	}

}
