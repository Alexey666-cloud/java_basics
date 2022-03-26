import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // TODO: написать консольное приложение для работы со списком дел todoList

        String firstLine = "";
        int index = 0;
        String secondLine = "";

        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] array = nextLine.split(" ");
        String newCommand = array[0];
        String regex = "[aA-zZ|0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(array[1]);

        if (matcher.find()) {
            firstLine = array[1];
            index = Integer.parseInt(firstLine);
            nextLine.replace(firstLine, "");

            if (newCommand.equals("ADD")) {
                todoList.add(secondLine);
            }
            System.out.println("Добавлено дело: " + index + " " + secondLine.trim());
        }
    }
}
