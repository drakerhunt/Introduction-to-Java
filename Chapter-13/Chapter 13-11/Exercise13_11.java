class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(5);
		Octagon o2 = o1.clone();
		
		System.out.println("Octagon 1 area: " + o1.getArea());
		System.out.println("Octagon 2 area: " + o2.getArea());
		System.out.println("Octagon 1 perimeter: " + o1.getPerimeter());
		System.out.println("Octagon 2 perimeter: " + o2.getPerimeter());
	}
}