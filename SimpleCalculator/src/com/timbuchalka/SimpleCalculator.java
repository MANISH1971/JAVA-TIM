package com.timbuchalka;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    // 1st method
    public double getFirstNumber() {
        return this.firstNumber;
    }

    // 2nd method
    public double getSecondNumber() {
        return this.secondNumber;
    }

    // 3rd method
    public void setFirstNumber(double parameter) {
//        System.out.println("setFirstNumber = "+parameter);
        this.firstNumber = parameter;
        //return parameter;
    }

    //4th method
    public void setSecondNumber(double parameter) {
        this.secondNumber = parameter;
       // return this.secondNumber;
    }

    //5th method
    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    //6th method
    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    //7th method
    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }
    // 8th method
    public double getDivisionResult() {
        if(this.secondNumber == (double) 0) return (double) 0;

        return this.firstNumber / this.secondNumber;
    }
}
