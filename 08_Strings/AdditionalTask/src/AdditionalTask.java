import java.util.Scanner;
import java.util.regex.Pattern;

public class AdditionalTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            char[] c = Pattern.compile("[^[0-9]]{1,1}")
                    .matcher(input)
                    .replaceAll("").toCharArray();
            String res2 = String.format("+%s (%s%s%s) %s%s%s-%s%s-%s%s",
                    c[0],
                    c[1],
                    c[2],
                    c[3],
                    c[4],
                    c[5],
                    c[6],
                    c[7],
                    c[8],
                    c[9],
                    c[10]);
            System.out.println(res2);
            //Ниже приведённый пример не получается реализовать
//        String s = Pattern.compile("([0-9])([0-9])([0-9])([0-9])([0-9])([0-9])([0-9])([0-9])([0-9])([0-9])([0-9])")
//                .matcher(phoneNum)
//                .replaceAll("+${1} (${2}${3}${4}) ${5}${6}${7}-${8}${9}-${10}${11}");
//        System.out.println(s);
        }
    }
}

