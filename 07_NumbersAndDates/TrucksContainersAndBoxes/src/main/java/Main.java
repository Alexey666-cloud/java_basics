import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int container = 1;
        int truck = 1;
        int boxInCont = 27;
        int inTruckCount = 12;
        Scanner scanner = new Scanner(System.in);

        int box = scanner.nextInt();
        if (box > 0) {
            System.out.println("Грузовик: " + truck);
            System.out.println("\tКонтейнер: " + container);
            for (int i = 1; i <= box; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % (inTruckCount * boxInCont) == 0 && i != box) {
                    truck++;
                    System.out.println("Грузовик: " + truck);
                }

                if (i % boxInCont == 0 && i != box) {
                    container++;
                    System.out.println("\tКонтейнер: " + container);
                }

            }
            System.out.println("Необходимо:\nгрузовиков - " + truck + " шт." + "\nконтейнеров - " + container + " шт.");

        } else {
            System.out.println("Необходимо:\n" +
                    "грузовиков - 0 шт.\n" +
                    "контейнеров - 0 шт.");
        }
    }
}
