package ru.skillbox;

public class Dimensions {
    private final int width;
    private final int height;
    private final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void cargoCalc() {
        System.out.println("Общий объём груза: " + length * height * width + " м³");
    }
}
