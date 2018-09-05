public abstract class GeometricObject implements Colorable {
	
	public double area;
	
	public GeometricObject() {
	}
	
	public void setArea(double newArea) {
		this.area = newArea;
	}
	public double getArea() {
		return this.area;
	}
	
	public void howToColor() {
		System.out.println("You don't.");
	}
}