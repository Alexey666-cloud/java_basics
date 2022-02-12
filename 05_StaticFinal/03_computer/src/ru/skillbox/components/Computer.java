package ru.skillbox.components;

public class Computer {

     private final String vendor;
     private final String name;

     private Processor processor;
     private Hdd hdd;
     private Keyboard keyboard;
     private Ram ram;
     private Display display;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public int getComputerWeight() {
        return processor.getWeight()
                + hdd.getWeight()
                + keyboard.getWeight()
                + ram.getWeight()
                + display.getWeight();
    }

    @Override
    public String toString() {
        return "COMPUTER  - " + vendor + ", " + name + System.lineSeparator() +
                "Processor: " + " частота: " + processor.getRate() + ", " +
                " производитель: " + processor.getManufacturer() + ", " +
                " колличество ядер: " + processor.getCoresCount() + ", " +
                " вес: " + processor.getWeight() + " грамм" + System.lineSeparator() +
                "Hdd: " + " объём: " + hdd.getSizeInGb() + ", " +
                " тип: " + hdd.getType() + "," +
                " вес: " + hdd.getWeight() + " грамм" + System.lineSeparator() +
                "Keyboard: " + " подсветка:  " + (keyboard.isHighlights() ? "есть подсветка" : "нет подсветки") + ", " +
                " вес: " + hdd.getWeight() + " грамм" + System.lineSeparator() +
                "Ram: " + " объём: " + ram.getSizeInGb() + ", " +
                " вес: " + ram.getWeight() + " грамм" + System.lineSeparator() +
                "Display: " + " размер: " + display.getSize() + ", " +
                " тип матрицы: " + display.getDisplayType() + ", " +
                " вес: " + display.getWeight() + " грамм" + System.lineSeparator();
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    }
