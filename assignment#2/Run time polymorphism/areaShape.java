import java.util.Scanner;
class Shape {
	public void calculateArea(){
		System.out.println("Area to be calculaated here . . ");
	}
}
 class areaRectangle extends Shape{
	 public void calculateArea(){
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the width of rectangle . . ");
		float w = input.nextFloat();
		System.out.println("Enter the length of rectangle . . ");
		float l = input.nextFloat();
		System.out.println("The area of the rectangle is : " + w*l);
		} 
 }
 class areaCircle extends Shape{
	 public void calculateArea(){
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the radius of circle . . ");
		float r = input.nextFloat();
		System.out.println("The area of the circle is : " + Math.PI*Math.pow(r,2));
		} 
 }

 class areaTriangle extends Shape{
	 public void calculateArea(){
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the side a . . ");
		float a = input.nextFloat();
		System.out.println("Enter the side b . . ");
		float b = input.nextFloat();
		System.out.println("Enter the side c . . ");
		float c = input.nextFloat();
		float h=a+b+c/2;
		float area = h*(h-a)*(h-b)*(h-c);
		System.out.println("The area of the triangle is : " + Math.sqrt(area));
		} 
 }
 public class areaShape{
	 public static void main(String args[]){
		 Shape a = new areaTriangle();
		 a.calculateArea();
		 a = new areaCircle();
		 a.calculateArea();
		 a = new areaRectangle();
		 a.calculateArea();
		 
	 }
 }