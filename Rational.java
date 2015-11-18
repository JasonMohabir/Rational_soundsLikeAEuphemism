// Team soundsLikeAEuphemism -- Jason Mohabir, Shamaul Dilmohamed
// APCS1 pd10
// HW33 -- Do You Even Add, Bro?
// 2015-11-18
public class Rational {
   
    private int numer;
    private int denom;

    // Default Setting
    public Rational() {
	numer = 0;
	denom = 1;
    }

    public Rational(int n, int d) {
	this();
	// denominator cannot be zero
	if (d == 0) {
	    System.out.println("Invalid. Setting to 0/1");
	}
	else {
	    numer=n;
	    denom=d;
	}
    }

    public String toString() {
	return numer + "/" + denom;
    }

    // returns the most precise float version of the rational
    public double floatValue() {
	return ((double)numer)/denom;
    }

    public void multiply(Rational factor) {
	numer *= factor.numer;
	denom *= factor.denom;
    }

    public void divide(Rational factor) {
	denom *= factor.numer;
	numer *= factor.denom;
    }
    
    public void add(Rational factor) {
	int temp = factor.numer * denom;
	numer *= factor.denom;
	denom *= factor.denom;
	numer += temp;
    }

    public void subtract(Rational factor) {
	int temp = factor.numer * denom;
	numer *= factor.denom;
	denom *= factor.denom;
	numer -= temp;
    }

}
