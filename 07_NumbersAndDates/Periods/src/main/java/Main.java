import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
        getPeriodFromBirthday("23/05/1995");
    }


    private static String getPeriodFromBirthday(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(birthday, formatter);
        LocalDate now = LocalDate.now();
        Period period = Period.between(localDate, now);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " month, " + period.getDays() + " days");
        return "";
    }

}