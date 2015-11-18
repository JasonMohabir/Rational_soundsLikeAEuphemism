public class Driver {

    public static void main(String[] args) {
	Rational r = new Rational (2,3);
	Rational s = new Rational (1,2);
	Rational t = new Rational (4,0);
	System.out.println("Testing floatValue()");
	System.out.println("s: " + s.floatValue());
	System.out.println("r: " + r.floatValue());

	r = new Rational (2,3);
	s = new Rational (1,2);
	t = new Rational (4,0);

	System.out.println("Testing toString()");
	System.out.println("r:" + r);
	System.out.println("t:" + t);

	r = new Rational (2,3);
	s = new Rational (1,2);
	t = new Rational (4,0);

	System.out.println("Testing multiply()");
	r.multiply(s);
	System.out.println("s:" + s);
	System.out.println("r:" + r);

	r = new Rational (2,3);
	s = new Rational (1,2);
	t = new Rational (4,0);

	System.out.println("Testing divide()");
	r.divide(s);
	System.out.println("s:" + s);
	System.out.println("r:" + r);

	r = new Rational (2,3);
	s = new Rational (1,2);
	t = new Rational (4,0);

	System.out.println("Testing add()");
	r.add(s);
	System.out.println("s:" + s );
	System.out.println("r:" + r );

    }
}
