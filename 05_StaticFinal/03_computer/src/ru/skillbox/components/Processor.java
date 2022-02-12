package ru.skillbox.components;

public class Processor {
    private final int rate;
    private final int coresCount;
    private final String manufacturer;
    private final int weight;

    public Processor(int rate, int coresCount, String manufacturer, int weight) {
        this.rate = rate;
        this.coresCount = coresCount;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getRate() {
        return rate;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

}
