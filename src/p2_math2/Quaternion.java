package p2_math2;

public class Quaternion {
    private double a;
    private double b;
    private double c;
    private double d;

    public Quaternion(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}
    public double getD() {return d;}

    // "Four basic operations"
    public static Quaternion add(Quaternion addend1, Quaternion addend2) {
        return new Quaternion(addend1.a + addend2.a, addend1.b + addend2.b, addend1.c + addend2.c, addend1.d + addend2.d);
    }

    public static Quaternion subtract(Quaternion minuend, Quaternion subtrahend) {
        return new Quaternion(minuend.a - subtrahend.a, minuend.b - subtrahend.b, minuend.c - subtrahend.c, minuend.d - subtrahend.d);
    }

    // "Two I/O operations"
}
