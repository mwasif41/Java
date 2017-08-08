//java.util.Calendar

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("Nisum technologies");
		StringBuilder builder = new StringBuilder("Nisum technologies");
		//Calendar.getInstance().get(Calendar.MILLISECOND);
		long start_time = System.nanoTime();
		for(int i=0 ; i < buffer.length() ; i++ )
			System.out.print(buffer.charAt(i));
		
		long finish_time =System.nanoTime();
		
		long bufferTime = finish_time - start_time;
		
		start_time = System.nanoTime();
		for(int i=0 ; i < builder.length() ; i++ )
			System.out.print(builder.charAt(i));
		
		finish_time = System.nanoTime();
		long builderTime = finish_time - start_time;
		System.out.println("String builder time is: "+ builderTime+" ns" );
		System.out.println("String buffer time is: "+ bufferTime+" ns" );
		
		
		if(builderTime > bufferTime){
			System.out.println("Buffer is faster");
		}
		else{
			System.out.println("Builder is faster");
				
		}
	}

}
