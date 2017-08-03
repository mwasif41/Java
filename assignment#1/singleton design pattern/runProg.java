
public class runProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// client want singleton multiple times and gets the same instance
		singleton.getSingleton().printSingleton();

		singleton.getSingleton().printSingleton();

		singleton.getSingleton().printSingleton();
	}

}
