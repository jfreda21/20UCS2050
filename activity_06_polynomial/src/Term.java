/*
 * CS 2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 06 - Term
 */

public class Term {

    private double coefficient;
    private int    exponent;
    private Term   next;

    private static final double TOLERANCE = 0.00000001;
    private static final double DEFAULT_COEFFICIENT = 0;

    public Term(double coefficient, int exponent) {
        if (Math.abs(coefficient) <= TOLERANCE)
            this.coefficient = DEFAULT_COEFFICIENT;
        else
            this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }

    public Term(double coefficient) {
        this(coefficient, 0);
    }

    public Term() {
        this(1, 0);
    }

    public double getCoefficient() {
        return coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public Term getNext() {
        return next;
    }

    public void setNext(final Term next) {
        this.next = next;
    }

    // TODOd: add the given term's coefficient to the callee term's coefficient if and only if they have the same exponent value
    // Term t1 = new Term(5, 2);  5x^2
    // Term t2 = new Term(3, 2);  3x^2
    // t1.add(t2);
    // t1 will be 8x^2
    // t2 will still be 3x^2
    public void add(final Term other) {
        if (exponent == other.exponent)
            coefficient += other.coefficient;
    }

    // TODOd: two terms are considered to be equal if they have the same values for their coefficient and exponent; note that coefficient is a floating-point value, so make sure you accept a TOLERANCE when comparing two coefficients for equality
    // Term t1 = new Term(5, 2);  5x^2
    // Term t2 = new Term(3, 2);  3x^2
    // if (t1.equals(t2)) ...
    @Override
    public boolean equals(Object obj) {
        // okay, chilll... we know that obj, although was given as a reference
        // to Object (because equals is a method that we are overriding) it is
        // in fact a Term
        // so let's use type casting to create a reference to Term from obj
        Term other = (Term) obj;
        if ( exponent == other.exponent &&
             Math.abs(coefficient - other.coefficient) <= TOLERANCE )
            return true;
        return false; // placeholder so the code compiles
    }

    // TODOd: use the following examples to figure it out the format to use:
    //  8x^3
    //  -2x^2
    //  7x
    //  3.2
    @Override
    public String toString() {
        String str = coefficient + "";
        if (exponent == 0)
            return str;
        str += "x";
        if (exponent != 1)
            str += "^" + exponent;
        return str;
    }

    // TODOd: return a new term that has the same coefficient and exponent of the callee term
    @Override
    public Object clone()  {
        Term newTerm = new Term(coefficient, exponent);
        return newTerm;
    }
}