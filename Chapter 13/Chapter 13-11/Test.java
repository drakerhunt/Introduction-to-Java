class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyStack stack1 = new MyStack();
		stack1.push("s");
		
		MyStack stack2 = (MyStack)stack1.clone();
		
		stack2.push("S2");
		
		System.out.println(stack1.toString());
		System.out.println(stack2.toString());
	}
}