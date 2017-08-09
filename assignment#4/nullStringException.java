
public class nullStringException extends RuntimeException {
	private String s;
	public nullStringException(String s){
		super(s); // to call parent constructor
	}
}
