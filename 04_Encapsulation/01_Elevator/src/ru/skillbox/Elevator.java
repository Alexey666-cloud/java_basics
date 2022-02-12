package ru.skillbox;

public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int targetFloor) {
        if (targetFloor < minFloor || targetFloor > maxFloor) {
            System.out.println("Error");
            return;
        }

        if (targetFloor == currentFloor) {
            System.out.println("Doors open");
            return;
        }

        if (targetFloor > currentFloor) { //moveUp
            int dif = targetFloor - currentFloor;
            for (int i = 0; i < dif; i++) {
                moveUp();
            }
        }

        if (targetFloor < currentFloor) { //moveDown
            int dif = currentFloor - targetFloor;
            for (int i = 0; i < dif; i++) {
                moveDown();
            }
        }
    }

    private void moveDown() {
        System.out.println(--currentFloor);
    }

    private void moveUp() {
        System.out.println(++currentFloor);
    }

}
