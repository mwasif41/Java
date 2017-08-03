
public class singleton {
	//Static member: It gets memory only once because of static, itcontains the instance of the Singleton class
	public static singleton s = new singleton();
	//s = null;
	
	private singleton(){
		// private constructor to prevent others from classes making instance		
	}
	
	public static singleton getSingleton(){
		return s;
	}
	
	public void printSingleton(){
		System.out.println("inside the singleton class");
	}
	
}


