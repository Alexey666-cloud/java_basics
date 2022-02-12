package ru.skillbox.components;

import ru.skillbox.HddType;

public class Hdd {
    private final int sizeInGb;
    private final int weight;

    private final HddType type;

    public Hdd(int sizeInGb, int weight, HddType type) {
        this.sizeInGb = sizeInGb;
        this.weight = weight;
        this.type = type;
    }

    public int getSizeInGb() {
        return sizeInGb;
    }

    public int getWeight() {
        return weight;
    }

    public HddType getType() {
        return type;
    }
}
