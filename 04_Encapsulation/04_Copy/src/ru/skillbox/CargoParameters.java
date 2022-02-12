package ru.skillbox;

public class CargoParameters {

    private final int weight;
    private final String deliveryAddress;
    private final boolean property;
    private final String registrationNumber;
    private final boolean fragile;

    public CargoParameters(int weight, String deliveryAddress, boolean property, String registrationNumber, boolean fragile) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public CargoParameters setWeight(int weight) {
        return new CargoParameters(weight, deliveryAddress, property, registrationNumber, fragile);
    }

    public CargoParameters setDeliveryAddress(String deliveryAddress) {
        return new CargoParameters(weight, deliveryAddress, property, registrationNumber, fragile);
    }

    public CargoParameters setProperty(boolean property) {
        return new CargoParameters(weight, deliveryAddress, property, registrationNumber, fragile);
    }

    public CargoParameters setRegistrationNumber(String registrationNumber) {
        return new CargoParameters(weight, deliveryAddress, property, registrationNumber, fragile);
    }

    public CargoParameters setFragile(boolean fragile) {
        return new CargoParameters(weight, deliveryAddress, property, registrationNumber, fragile);
    }

    public int getWeight() {
        System.out.println("Вес груза: " + weight + " кг");
        return weight;
    }

    public String getDeliveryAddress() {
        System.out.println("Адрес доставки: " + deliveryAddress);
        return deliveryAddress;
    }

    public String getProperty() {
        if (property) {
            return "Груз нельзя переворачивать!";
        }
        else {
            return "Груз можно переворачивать!";
        }
    }

    public String getRegistrationNumber() {
        System.out.println("Регистрационный номер: " + registrationNumber);
        return registrationNumber;
    }

    public String getFragile() {
            if (fragile) {
                return "Осторожно! Груз хрупкий!" + "\n";
            }
            else {
                return "Груз можно отправлять" + "\n";
            }
    }
}

/*
Что нужно сделать
Создайте иммутабельный класс для хранения информации о грузах, передаваемых в курьерскую службу. Название класса придумайте самостоятельно.
Создайте у класса следующие поля:
габариты;
масса;
адрес доставки;
свойство — можно ли переворачивать;
регистрационный номер (может содержать буквы);
является ли груз хрупким.
Названия полей придумайте самостоятельно.
Типы полей задайте в соответствии с данными, которые в них содержатся.
Габариты — ширина, высота и длина — должны храниться в отдельном иммутабельном классе Dimensions. Создайте класс Dimensions с соответствующими полями и реализуйте в нём метод вычисления объёма груза (название метода придумайте самостоятельно).
Реализуйте в классе методы, дающие возможность изменять адрес доставки, габариты и массу груза без изменения исходного объекта путём создания его копии.
*/
