package ru.skillbox;

public class Transport {

    private String typeTransport;
    private int quantityFlights;
    private int quantityPassenger;

    public Transport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public void setQuantityFlights(int quantityFlights) {
        this.quantityFlights = quantityFlights;
    }

    public void setQuantityPassenger(int quantityPassenger) {
        this.quantityPassenger = quantityPassenger;
    }

    public String getTypeTransport() {
        System.out.println("Вид транспорта: " + typeTransport);
        return typeTransport;
    }

    public int getQuantityFlights() {
        System.out.println("Колличество рейсов: " + quantityFlights);
        return quantityFlights;
    }

    public int getQuantityPassenger() {
        System.out.println("Вместимость пассажиров: " + quantityPassenger + " человек");
        return quantityPassenger;
    }
}
/*
Задание 2
Что нужно сделать

Выберите любой объект реального мира с тремя-четырьмя свойствами и создайте для него POJO-класс, содержащий:

Конструктор с одним-двумя основными свойствами.
Методы-геттеры и методы-сеттеры для всех свойств объектов этого класса.
*/
