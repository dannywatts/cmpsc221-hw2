package p4_complex;

public class Main {
    static void main() {
        Complex a = new Complex();
        Complex b = new Complex(1);
        Complex c = new Complex(2, 3);
        Complex d = new Complex(2, 3);
        System.out.printf("a = %s\n", a);
        System.out.printf("b = %s\n", b);
        System.out.printf("c = %s\n", c);
        System.out.printf("d = %s\n", d);
        System.out.printf("a = b? %b\n", a.equals(b));
        System.out.printf("c = d? %b\n", c.equals(d));
        System.out.printf("a + b = %s\n", Complex.addition(a, b));
        System.out.printf("b - c = %s\n", Complex.subtraction(b, c));
        System.out.printf("c * d = %s\n", Complex.multiplication(c, d));
    }
}
