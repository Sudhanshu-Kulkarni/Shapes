//Circle.java
import java.lang.*;
class Rectangle extends Shape{
	private double length, breadth;
	public Rectangle(double length, double breadth){
			 //dim1  dim2 dim3 num_sides
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea(){
		return length * breadth;
	}

	public double calculatePerimeter(){
		return(2 * length + 2 * breadth);
	}

}