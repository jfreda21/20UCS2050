/*
 * CS 2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 06 - PolynomialDriver
 */

import java.util.Scanner;

public class PolynomialDriver {

    static final Polynomial readPolynomial(Scanner sc) {
        Polynomial p = new Polynomial();
        System.out.print("Enter the degree of the polynomial: ");
        int degree = sc.nextInt();
        for (int e = degree; e >= 0; e--) {
            System.out.print("Enter coefficient for x^" + e + " term: ");
            double c = sc.nextDouble();
            Term aTerm = new Term(c, e);
            p.addTerm(aTerm);
        }
        return p;
    }

    // TODO: see activity instructions for more information about what to do here
    public static void main(String[] args) {
        //  8x^3
        //  -2x^2
        //  7x
        //  3.2
        Term t1, t2, t3, t4;
        t1 = new Term(8, 3);
        System.out.println(t1);
        t2 = new Term(-2, 2);
        System.out.println(t2);
        t3 = new Term(7, 1);
        System.out.println(t3);
        t4 = new Term(3.2);
        System.out.println(t4);

        Term t4clone = (Term) t4.clone();
        System.out.println(t4clone);
    }
}
