package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(10, 4);
        int a = arithmeticCalculator.calculate(Operation.SUBTRACT);
        System.out.println(a);
       }
}
