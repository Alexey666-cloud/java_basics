package ru.skillbox.components;

import ru.skillbox.DisplayType;

import java.lang.reflect.Type;

public class Display {
    private final int size;
    private final int weight;
    private final DisplayType displayType;

    public Display(int size, int weight, DisplayType displayType) {
        this.size = size;
        this.weight = weight;
        this.displayType = displayType;
    }


    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }
}
