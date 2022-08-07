package com.timbuchalka;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return this.real;
    }
    public double getImaginary() {
        return this.imaginary;
    }
    public void add(double real,double imaginary) {
/*        this.real = real+real;
        this.imaginary = imaginary + imaginary;*/
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber complexnumber) {
          add(complexnumber.real,complexnumber.imaginary);
    }
    public void subtract(double real,double imaginary) {
        this.real -= real;
        this.imaginary -=imaginary;
    }
    public void subtract(ComplexNumber complexNumber) {
        //subtract(this.real,this.imaginary);
        subtract(complexNumber.real, complexNumber.imaginary);
    }
}
