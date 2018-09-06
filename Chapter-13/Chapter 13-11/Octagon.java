public class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable {
	
	double sideLength;
	double perimeter;
	
	public Octagon() {
		this.sideLength = 1;
		this.perimeter = sideLength * 8;
	}
	public Octagon(double sideLength) {
		this.sideLength = sideLength;
		this.area = ((2 + (4 / (Math.sqrt(2)))) * sideLength * sideLength);
		this.perimeter = this.sideLength * 8;
	}
	
	public void setSideLength(double newSideLength) {
		this.sideLength = newSideLength;
	}
	public double getSideLength() {
		return this.sideLength;
	}
	public double getPerimeter() {
		return perimeter;
	}
	
	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public String toString() {
		return ("Area: " + this.area + "\nPerimeter: " + this.perimeter);
	}
	@Override
	public Octagon clone() throws CloneNotSupportedException {
		Octagon o1 = (Octagon)super.clone();
		return o1;
	}
	@Override
	public int compareTo(GeometricObject o) {
		if (area > o.area)
			return 1;
		else if (area < o.area)
			return -1;
		else 
			return 0;
	}
}