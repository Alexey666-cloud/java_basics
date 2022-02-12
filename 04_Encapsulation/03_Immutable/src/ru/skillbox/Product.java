package ru.skillbox;

public class Product {

    public int price;
    private final String name;
    private final int barCode;

    public Product(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        System.out.println("Имя продукта: " + name);
        return name;
    }

    public int getPrice() {
        System.out.println("Цена продукта: " + price + " руб");
        return price;
    }

    public int getBarCode() {
        System.out.println("Штрихкод: " + barCode);
        return barCode;
    }
}
/*
*Что нужно сделать

Модифицируйте класс Product, разобранный в видеоуроке, следующим образом:

добавьте в класс неизменяемое поле barCode (штрихкод);
поле price сделайте изменяемым и уберите его из конструктора, класс при этом перестанет быть иммутабельным.
* */
