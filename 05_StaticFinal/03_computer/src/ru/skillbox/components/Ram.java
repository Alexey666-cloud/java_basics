package ru.skillbox.components;

public class Ram {
    private final int sizeInGb;
    private final int weight;

    public Ram(int size, int weight) {
        this.sizeInGb = size;
        this.weight = weight;
    }

    public int getSizeInGb() {
        return sizeInGb;
    }

    public int getWeight() {
        return weight;
    }
}
