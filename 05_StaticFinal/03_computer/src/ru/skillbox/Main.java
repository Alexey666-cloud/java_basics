package ru.skillbox;

import ru.skillbox.components.*;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Intel", "Vasya");

        Processor processor = new Processor(4000, 4, "Intel", 45);
        computer.setProcessor(processor);

        Display display = new Display(32, 4200, DisplayType.TN);
        computer.setDisplay(display);

        computer.setHdd(new Hdd(500, 250, HddType.HDD));

        computer.setKeyboard(new Keyboard(false, 500));

        computer.setRam(new Ram(16,15));

        var weight = computer.getComputerWeight();
        var string = computer.toString();
        System.out.println(string);
        System.out.println("Общий вес компьютера: " + weight + " грамм");
    }
}
