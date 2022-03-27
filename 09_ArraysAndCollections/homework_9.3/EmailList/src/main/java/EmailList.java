import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        String emailSeparator = ".";
        String dogChar = "@";
        Pattern upperСaseRegex = Pattern.compile("[A-Z]");
        Matcher matcher = upperСaseRegex.matcher(email);

        // TODO: валидный формат email добавляется
        if (email.contains(emailSeparator) && email.contains(dogChar)) {
            emailList.add(email);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return new ArrayList<>(emailList);
    }

}
