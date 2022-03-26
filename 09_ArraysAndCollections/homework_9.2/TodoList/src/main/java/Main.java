import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // TODO: написать консольное приложение для работы со списком дел todoList

        System.out.println("Введите в консоль команды, для выполнения действия: "
                + "\n1 - LIST - вывод списка дел"
                + "\n2 - ADD - создать дело"
                + "\n3 - EDIT - редактировать дело"
                + "\n4 - DELETE - Удалить дело");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String nextLine = scanner.nextLine();
            String[] inputStringArray = nextLine.split(" ");
            String command = inputStringArray[0];
            int size = 0;
            String todo = "";

            if (command.equals("ADD")) {
                size = todoList.todoList.size();
                String[] todoArray = new String[inputStringArray.length - 1];
                System.arraycopy(inputStringArray, 1, todoArray, 0, inputStringArray.length - 1);
                todo = createTodoString(todoArray);
                todoList.add(size + 1, todo);
                System.out.println("Добавлено дело: " + todo);
            }
            
            if (command.equals("EDIT")) {
                todoList.edit(todo, Integer.parseInt(inputStringArray[1]));
                System.out.println("Дело перезаписано!");
            }

            if (command.equals("DELETE")) {
                todoList.delete(Integer.parseInt(inputStringArray[1]));
                System.out.println("Дело удалено!");
            }

            if (command.equals("LIST")) {
                todoList.getTodos();
            }
            
            if (command.equals("EXIT")) {
                scanner.close();
                System.exit(0);
            }
        }
    }

    private static String createTodoString(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            stringBuilder.append(args[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}

