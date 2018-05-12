package com.cherevko.dmytro.model;

public class CalcModel {
    private double calculationValue;

    public void addNumbers(double firstNumber, double secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    public void subNumbers(double firstNumber, double secondNumber) {
        calculationValue = firstNumber - secondNumber;
    }

    public void mulNumbers(double firstNumber, double secondNumber) {
        calculationValue = firstNumber * secondNumber;
    }

    public void divNumbers(double firstNumber, double secondNumber) {
        calculationValue = firstNumber / secondNumber;
    }

    public double getCalculationValue() {
        return calculationValue;
    }
}

