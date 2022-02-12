package ru.skillbox;

public class ArithmeticCalculator {
    private int a = 0;
    private int b = 0;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(Operation type) {
        System.out.println("Вызвано: " + type.name());
        if (type == Operation.ADD) {
            return a + b;
        }

        if (type == Operation.SUBTRACT) {
            return a - b;
        }

        if (type == Operation.MULTIPLY) {
            return a * b;
        }

        return 0;
    }
}
/*
* Что нужно сделать
Создайте класс ArithmeticCalculator, который будет выполнять арифметические операции над числами.
Реализуйте конструктор с двумя параметрами-числами, который сохраняет переданные числа в свойствах класса.
Реализуйте метод calculate, на вход которого передаётся одна из арифметических операций (объект класса Operation — смотрите следующий пункт задания), которую нужно произвести с двумя числами, переданными в конструктор при создании объекта.
Создайте Enum Operation с тремя значениями: ADD, SUBTRACT, MULTIPLY. Эти значения будут соответствовать арифметическим операциям — сложению, вычитанию и умножению.
* */


