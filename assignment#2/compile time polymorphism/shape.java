
public class shape {
	
	public void calculateArea(float length,float width){
		System.out.println("Area of the rectangle is :" + length * width);
	}
	
	public void calculateArea(float radius){
		System.out.println("Area of the circle is :" + Math.PI*Math.pow(radius, 2));
	}
	
	public void calculateArea(float a,float b,float c){
		float h = (a+b+c)/2;
		double temp = h*(h-a)*(h-b)*(h-c);
		double area = Math.sqrt(temp);
		
		System.out.println("Area of the Triangle is :" + area );
	}
	public static void main(String args[]){
		shape s = new shape();
		s.calculateArea(22);
		s.calculateArea(22,23);
		s.calculateArea(22,22,22);
		
		
	}
}
