package com.testing;

public interface Shape {
	void area();
	void perimeter();
	static void circumferance() {
		System.out.println("circumferance of the circle is 432");
	}
	static int number = 100;
	String Shapes = "Oval Shape";

}
class Circle implements Shape{

	@Override
	public void area() {
		System.out.println("area of the circle is 323");
		
	}

	@Override
	public void perimeter() {
		System.out.println("perimeter of the circle is 876");
		
	}
	public static void main(String[] args) {
		Circle circle= new Circle();
		circle.area();
		circle.perimeter();
		Shape.circumferance();
		System.out.println(Shape.number);
		System.out.println(Shape.Shapes);
	}
	
}