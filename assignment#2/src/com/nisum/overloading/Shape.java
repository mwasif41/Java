package com.nisum.overloading;

/**The shape class is implemented to represent different Shapes 
 * It uses the essence of polymorphism (i.e overloading)
 * @author mwasif
 *
 */
public class Shape {
	/**Calculate area: to calculate the area of rectangle
	 * @param length is the length of rectangle
	 * @param width is the width of rectangle
	 */
	public void calculateArea(float length, float width) {
		System.out.println("Area of the rectangle is :" + length * width);
	}

	/**Calculate area: to calculate the area of Circle and print in console
	 * @param radius this is the radius of the circle
	 */
	public void calculateArea(float radius) {
		System.out.println("Area of the circle is :" + Math.PI * Math.pow(radius, 2));
	}

	/**Calculate area: to calculate the area of Triangle and print in console
	 * @param side1 is the first side of the traingle
	 * @param side2 is the second side of the traingle
	 * @param side3 is the third side of the traingle
	 */
	public void calculateArea(float side1, float side2, float side3) {
		float h = (side1 + side2 + side3) / 2;
		double temp = h * (h - side1) * (h - side2) * (h - side3);
		double area = Math.sqrt(temp);

		System.out.println("Area of the Triangle is :" + area);
	}
	
	/**tihs is the entry point to check the Shape class
	 * <p>
	 * it makes an object of shape and calculates its area on different parameters
	 * @param args
	 */
	public static void main(String args[]) {
		Shape shape = new Shape();
		shape.calculateArea(22);
		shape.calculateArea(22, 23);
		shape.calculateArea(22, 22, 22);
	}
}
