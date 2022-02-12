import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        int x = 0;
        String text = "";

        while (birthday.isBefore(LocalDate.now()) || birthday.isEqual(LocalDate.now()) ) {
            text += x + " - " + birthday.format(formatter) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            x++;
            System.out.println(text);
        }
      return text;
    }
}
