import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();

        int spaceIndex0 = line.indexOf(" ");
        int spaceIndex1 = line.indexOf(" ", spaceIndex0 + 1);
        if (!isInputLineCorrect(line, spaceIndex0, spaceIndex1)) {
            System.out.println("Введенная строка не является ФИО");
            return;
        }
        System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s",
                line.substring(0, spaceIndex0).trim(),
                line.substring(spaceIndex0, spaceIndex1).trim(),
                line.substring(spaceIndex1).trim());
        scanner.close();
    }

    private static boolean isInputLineCorrect(String line, int spaceIndex0, int spaceIndex1) {
        if (line.indexOf(" ", spaceIndex1 + 1) != -1) return false;
        if (spaceIndex0 == -1 || spaceIndex1 == -1) return false;
        for (int i = 0; i < line.length(); i++) {

            if (!Character.UnicodeBlock.of(line.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC) && line.charAt(i) != '-' ) {
                return false;
            }
            else return true;
        }
//        String[] restrictedChars = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@", "#", "$", "%", "^", "&", "*", "*", "(", ")",
//                "_", "+", "=", "{", "}", "[", "]", "/", "`", "~", "\\"};
//        for (String s : restrictedChars) {
//            if (line.contains(s)) {
//                return false;
//            }
//        }
        return true;
    }
}



