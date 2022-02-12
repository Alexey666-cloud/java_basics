package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(10, 15, 33);
        dimensions.cargoCalc();

        CargoParameters cargoParameters = new CargoParameters(567, "Красных Партизан 105", true, "2323acv55tR", true);
        cargoParameters.getWeight();
        cargoParameters.getDeliveryAddress();
        System.out.println(cargoParameters.getProperty());
        cargoParameters.getProperty();
        cargoParameters.getRegistrationNumber();
        cargoParameters.getFragile();
        System.out.println(cargoParameters.getFragile());

        CargoParameters copy = new CargoParameters(347, "Валентина Юдашкина 66", false, "577ЕкМ92В", false);
        copy.getWeight();
        copy.getDeliveryAddress();
        System.out.println(copy.getProperty());
        copy.getProperty();
        copy.getRegistrationNumber();
        copy.getFragile();
        System.out.println(copy.getFragile());

        CargoParameters secondCopy = new CargoParameters(900, "Столярная 88", false, "8765шзкМ23В", true);
        secondCopy.getWeight();
        secondCopy.getDeliveryAddress();
        System.out.println(secondCopy.getProperty());
        secondCopy.getProperty();
        secondCopy.getRegistrationNumber();
        secondCopy.getFragile();
        System.out.println(secondCopy.getFragile());
    }
}
