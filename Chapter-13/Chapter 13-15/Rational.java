import java.math.*;
import javax.print.attribute.standard.*;


public class Rational extends Number implements Comparable<Rational> {
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");
	
	public Rational() {
		this.numerator = new BigInteger("0");
		this.denominator = new BigInteger("1");
	}
	
	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : new BigInteger("-1")) .multiply(numerator).divide(gcd);
		this.denominator = ((denominator.compareTo(BigInteger.ZERO) > 0) ? denominator : denominator.multiply(new BigInteger("-1"))) .divide(gcd);
	}	
	
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		int gcdInt = 1;
		
		for (int k = 1; k <= n1.intValue() && k <= n2.intValue(); k++) {
			if (n1.intValue() % k == 0 && n2.intValue() % k == 0) {
				gcdInt = k;
			}
		}
		BigInteger gcd = new BigInteger(gcdInt + "");
		return gcd;
	}
	
	public BigInteger getNumerator() {
		return numerator;
	}
	
	public BigInteger getDenominator() {
		return denominator;
	}
	
	public Rational add(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator).multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	public Rational subtract(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator).multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	public Rational multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	public Rational divide(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.numerator);
		return new Rational(n, d);
	}
	
	@Override
	public String toString() {
		if (denominator.compareTo(BigInteger.ONE) == 0) {
			return numerator + "";
		}
		else {
			return numerator + "/" + denominator;
		}
	}
	
	@Override
	public boolean equals(Object other) {
		if ((this.subtract((Rational)(other))).getNumerator().compareTo(BigInteger.ZERO) == 0)
			return true;
		else 
			return false;
	}
	
	@Override
	public int intValue() {
		return (int)doubleValue();
	}
	
	@Override
	public float floatValue() {
		return (float)doubleValue();
	}
	
	@Override
	public double doubleValue() {
		return (numerator.doubleValue() / denominator.doubleValue());
	}
	
	@Override
	public long longValue() {
		return (long)doubleValue();
	}
	
	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else 
			return 0;
	}
}