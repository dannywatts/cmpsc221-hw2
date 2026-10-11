package p4_complex;

public class Complex {
    // Variables
    private double real;
    private double imaginary;

    // Constructors
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Accessors
    public double getReal() {return real;}
    public double getImaginary() {return imaginary;}

    // Mutators
    public void setReal(double real) {this.real = real;}
    public void setImaginary(double imaginary) {this.imaginary = imaginary;}

    // Overrides
    @Override
    public String toString() {return real + " + " + imaginary + "*i";}

    public boolean equals(Complex complex) {return real == complex.real && imaginary == complex.imaginary;}

    // Static methods
    public static Complex addition(Complex addend1, Complex addend2) {
        return new Complex(addend1.real + addend2.real, addend1.imaginary + addend2.imaginary);
    }

    public static Complex subtraction(Complex minuend, Complex subtrahend) {
        return new Complex(minuend.real - subtrahend.real, minuend.imaginary - subtrahend.imaginary);
    }

    public static Complex multiplication(Complex factor1, Complex factor2) {
        // a = f1.real, b=f1.imag, c=f2.real, d=f2.imag
        return new Complex(factor1.real * factor2.real - factor1.imaginary * factor2.imaginary, factor1.real * factor2.imaginary + factor1.imaginary * factor2.real);
    }
}
