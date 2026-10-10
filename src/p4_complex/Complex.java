package p4_complex;

public class Complex {
    // Variables
    private double real;
    private double imaginary;

    // Constructors
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

    @Override
    public boolean equals(Complex complex) {
        return real == complex.getReal() && imaginary == complex.getImaginary();
    }
}
