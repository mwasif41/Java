
public class runProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// client want singleton multiple times and gets the same instance
		for(int i=0; i<5; i++){
		singleton s = singleton.getSingleton();
		System.out.println(s);
		}
		
}

}
