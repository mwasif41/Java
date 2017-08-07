
public class literalAndObjString {

	public static void main(String[] args) {
		String name = "wasif"; // literal
		String anotherName = new String("wasif"); // object
		if(name == anotherName){
			System.out.println("The string are matched");
		}
		else
			System.out.println("==  unmatched");
		boolean value = name.equals(anotherName);
		System.out.println("equals() comarision is = " + value);
		
	}

}
