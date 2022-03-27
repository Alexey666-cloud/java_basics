import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();
    private static Pattern upperСaseRegex = Pattern.compile("[A-Z]");
    private static String emailSeparator = ".";
    private static String dogChar = "@";

    public void add(String email) {
        Matcher matcher = upperСaseRegex.matcher(email);

        // TODO: валидный формат email добавляется
        if (email.contains(emailSeparator) && email.contains(dogChar) && !matcher.find()) {
            emailList.add(email);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        ArrayList<String> resultList = new ArrayList<>(emailList);
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
        return resultList;
    }
}
