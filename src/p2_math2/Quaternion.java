package p2_math2;

import java.util.Scanner;

public class Quaternion {
    // Variables
    private double a;
    private double b;
    private double c;
    private double d;

    // Constructors
    public Quaternion() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }

    public Quaternion(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Accessors
    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}
    public double getD() {return d;}

    // Mutators
    public void setA(double a) {this.a = a;}
    public void setB(double b) {this.b = b;}
    public void setC(double c) {this.c = c;}
    public void setD(double d) {this.d = d;}

    // "Four basic operations"
    public static Quaternion add(Quaternion addend1, Quaternion addend2) {
        return new Quaternion(addend1.a + addend2.a, addend1.b + addend2.b, addend1.c + addend2.c, addend1.d + addend2.d);
    }

    public static Quaternion subtract(Quaternion minuend, Quaternion subtrahend) {
        return new Quaternion(minuend.a - subtrahend.a, minuend.b - subtrahend.b, minuend.c - subtrahend.c, minuend.d - subtrahend.d);
    }

    // The formula listed in the problem set is incorrect. This is the right equation pulled from
    // https://www.maths.tcd.ie/~dwilkins/Courses/MA2C02/MA2C02_Section4_0910.pdf. Results tested with online
    // quaternion calculator https://www.omnicalculator.com/math/quaternion.
    public static Quaternion multiply(Quaternion factor1, Quaternion factor2) {
        double a = factor1.a; double b = factor1.b; double c = factor1.c; double d = factor1.d;
        double p = factor2.a; double q = factor2.b; double r = factor2.c; double s = factor2.d;

//        return new Quaternion(a*p-b*q-c*r-d*s, a*q+b*p+c*s+d*r, a*r+c*p+d*q+b*s, a*s+d*p+b*r+c*q);
        return new Quaternion(
                a * p - b * q - c * r - d * s,
                a * q + b * p + c * s - d * r,
                a * r + c * p + d * q - b * s,
                a * s + d * p + b * r - c * q
        );
    }

    // Inverse and division based on https://www.maths.tcd.ie/~dwilkins/Courses/MA2C02/MA2C02_Section4_0910.pdf
    public static Quaternion inverse(Quaternion quaternion) {
        double normSquared = quaternion.a * quaternion.a + quaternion.b * quaternion.b + quaternion.c * quaternion.c + quaternion.d * quaternion.d;
        if (normSquared == 0.0) {
            throw new ArithmeticException("The zero quaternion has no inverse.");
        }
        // Inverse = conjugate / squared norm.
        return new Quaternion(quaternion.a / normSquared, -quaternion.b / normSquared,
                -quaternion.c / normSquared, -quaternion.d / normSquared);
    }

    public static Quaternion divide(Quaternion dividend, Quaternion divisor) {
        return Quaternion.multiply(dividend, Quaternion.inverse(divisor));
    }

    // Input operation
    public static Quaternion input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for a new quaternion.");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        System.out.print("d = ");
        double d = scanner.nextDouble();
        return new Quaternion(a, b, c, d);
    }

    // Output operation - toString
    @Override
    public String toString() {
        return "(" + a + "," + b + "," + c + "," + d + ")";
    }

    public boolean equals(Quaternion quaternion) {
        return a == quaternion.a && b == quaternion.b && c == quaternion.c && d == quaternion.d;
    }
}
