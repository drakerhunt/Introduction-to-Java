class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(5);
		Octagon o2 = o1.clone();
		
		System.out.println(o1.toString() + "\n" + o2.toString());
	}
}