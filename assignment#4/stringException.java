


public class stringException {
	
	private String s;
	
	public void setString(String x){
		if(x == null){
			throw new nullStringException("The string is null");
		}
		else{
			s = x;
		}
	}
	public String getString(){
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringException test = new stringException();
		try{
		test.setString(null);
		}catch(nullStringException e){
			e.printStackTrace();
		}
		System.out.println("The entered String is: " + test.getString());
	}

}
