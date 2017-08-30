package com.nisum.exception;



/**A string exception class that has a string member 
 * and is used to check the custom exception NullStringException
 * @see NullStringException
 * @author mwasif
 *
 */
public class stringException {
	
	private String anyString;
	
	/**A string Setter method
	 * @param givenString is the string to be setted
	 * @throws NullStringException is the custom string 
	 * that would be thrown if the string is null
	 */
	public void setString(String givenString) throws NullStringException{
		if(givenString == null){
			throw new NullStringException("The string is null");
		}
		else{
			anyString = givenString;
		}
	}
	/**A getter method for the string
	 * @return String it return a string 
	 */
	public String getString(){
		return anyString;
	}
	
	/** the main entry point to check the string weather
	 *  the string is will and throw the exception
	 *
	 */
	public static void main(String[] args) {
		stringException test = new stringException();
		try{
		test.setString(null);
		}catch(NullStringException exception){
			exception.printStackTrace();
		}
		System.out.println("The entered String is: " + test.getString());
	}

}
