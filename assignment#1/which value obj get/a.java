public class a{
	private int b =2;
	public static void main(String args[]){
		a first = new a();
		a second = first;
		first = null;
		System.out.println(first);
		System.out.println(second);
		
	}

}