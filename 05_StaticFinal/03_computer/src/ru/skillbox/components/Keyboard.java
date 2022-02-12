package ru.skillbox.components;

public class Keyboard {
    private final boolean highlights;
    private final int weight;

    public Keyboard(boolean highlights, int weight) {
        this.highlights = highlights;
        this.weight = weight;
    }

    public boolean isHighlights() {
            return highlights;
    }

    public int getWeight() {
        return weight;
    }
}
