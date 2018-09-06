import java.math.*;

public class Test extends Rational {
	public static void main(String[] args) {
		Rational r1 = new Rational(BigInteger.ONE, new BigInteger("1234567891234567890"));
		Rational r2 = new Rational(BigInteger.ONE, new BigInteger("1234567891234567890"));
		Rational r3 = new Rational(BigInteger.ONE, new BigInteger("1234567891234567890"));
		Rational r4 = new Rational(BigInteger.ONE, new BigInteger("1234567891234567890"));
		
		System.out.println("r1 * r2 * r3 is " + r1.multiply(r2.multiply(r3)));
	}
}