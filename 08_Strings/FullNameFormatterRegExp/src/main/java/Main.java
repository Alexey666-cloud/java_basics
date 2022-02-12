import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

  private final static Pattern pattern = Pattern.compile("^[a-zA-Zа-яА-Я|-]+\\s[a-zA-Zа-яА-Я|-]+\\s[a-zA-Zа-яА-Я|-]+$");

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine().trim();
    if (!isLineCorrect(line)) {
      System.out.println("Введенная строка не является ФИО");
      return;
    }
    int spaceIndex0 = line.indexOf(" ");
    int spaceIndex1 = line.indexOf(" ", spaceIndex0 + 1);
    System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s",
            line.substring(0, spaceIndex0).trim(),
            line.substring(spaceIndex0, spaceIndex1).trim(),
            line.substring(spaceIndex1).trim());
    scanner.close();
  }

  private static boolean isLineCorrect(String line) {
    return pattern.matcher(line).matches();
  }

}