package ru.skillbox;

public class Country {
    private String nameCountry;
    private int countPopular;
    private int spaceCountry;
    private String nameCapital;
    private boolean accessToTheSea;

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setCountPopular(int countPopular) {
        this.countPopular = countPopular;
    }

    public void setSpaceCountry(int spaceCountry) {
        this.spaceCountry = spaceCountry;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public void setAccessToTheSea(boolean accessToTheSea) {
        this.accessToTheSea = accessToTheSea;
    }

    public String getNameCountry() {
        System.out.println("Страна: " + nameCountry);
        return nameCountry;
    }

    public int getCountPopular() {
        System.out.println("Население: " + countPopular + " млн человек");
        return countPopular;
    }

    public int getSpaceCountry() {
        System.out.println("Площадь: " + spaceCountry + " км²");
        return spaceCountry;
    }

    public String getNameCapital() {
        System.out.println("Столица: " + nameCapital);
        return nameCapital;
    }

    public String getAccessToTheSea() {
        if (accessToTheSea) {
            return "Выход к морю есть";
        } else {
            return "Выхода к морю нет";
        }
    }
}


/*
Задание 1
Что нужно сделать
Создайте POJO-класс Country, который будет использоваться для хранения данных о странах, со следующими полями:

Название.
Численность населения.
Площадь в квадратных километрах.
Название столицы.
Наличие выхода к морю.


Создайте в этом классе:

Конструктор с одним параметром — названием страны.
Методы-геттеры для всех полей класса.
Методы-сеттеры для всех полей класса.


Имена полей и их типы установите самостоятельно так, чтобы они были понятными и соответствовали хранящимся в них данным.
*/
