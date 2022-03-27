import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        EmailList emailList = new EmailList();

        // TODO: написать консольное приложение для работы со списком дел todoList
        System.out.println("Введите в консоль команды, для выполнения действия: "
                + "\n1 - LIST - вывод списка дел"
                + "\n2 - ADD - создать дело"
                + "\n3 - EXIT - выход из программы");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String nextLine = scanner.nextLine();
            String[] inputStringArray = nextLine.split(" ");
            String command = inputStringArray[0];
            String email = "";

            if (command.equals("ADD")) {
                String[] emailArray = new String[inputStringArray.length - 1];
                System.arraycopy(inputStringArray, 1, emailArray, 0, inputStringArray.length - 1);
                email = createEmailString(emailArray);
                emailList.add(email);
                System.out.println("Адрес записан!");
            }
            else System.out.println(WRONG_EMAIL_ANSWER);

            if (command.equals("LIST")) {
                emailList.getSortedEmails();
            }

            if (command.equals("EXIT")) {
                scanner.close();
                System.exit(0);
            }
        }
    }

    private static String createEmailString(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            stringBuilder.append(args[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
