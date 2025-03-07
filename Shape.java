//Shape.java

abstract class Shape{
	protected String shapeName;

	//Zero parameters, initialising variables
	public Shape(String shapeName){
		this.shapeName = shapeName;
	}
	
	abstract public double calculateArea(); //Abstract methods
	abstract public double calculatePerimeter(); //Abstract methods


}