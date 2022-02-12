import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String regexClear = "[^0-9]";
            String phoneNumber = input.replaceAll(regexClear, "");

            String regex = "[7-8]+[0-9]{10}";

            if (phoneNumber.matches(regex)) {
                System.out.println(phoneNumber.replaceFirst("8", "7"));
                break;
            }
            if (phoneNumber.length() == 10) {
                System.out.println(phoneNumber.replaceFirst("", "7"));
                break;
            }
            if (phoneNumber.length() > 10 || phoneNumber.length() < 10) {
                System.out.println("Неверный формат номера");
                break;
            }
        }
    }
}

