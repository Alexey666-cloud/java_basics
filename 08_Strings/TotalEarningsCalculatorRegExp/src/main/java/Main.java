import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private final static Pattern pattern = Pattern.compile("[0-9]+");

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(calculateSalarySum(text));
    }

    public static int calculateSalarySum(String text) {
        Matcher matcher = pattern.matcher(text);
        Integer sum = 0;
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group(0));
        }
        return sum;
    }
}
