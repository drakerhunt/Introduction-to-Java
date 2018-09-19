import java.util.*;

public class Exercise18_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number for GCD: ");
		int m = input.nextInt();
		System.out.print("Enter second number for GCD: ");
		int n = input.nextInt();
		
		System.out.println("GCD is: " + gcd(m, n));
	}
	
	public static long gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		}
		else {
			return gcd(n, m % n);
		}
	}
}