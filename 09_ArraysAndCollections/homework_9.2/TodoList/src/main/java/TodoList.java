import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (!todo.isEmpty()) {
            if (index >= 0 && index < todoList.size()) {
                todoList.add(index, todo);
            } else todoList.add(todo);
        } else return;

    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения

        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
            todoList.add(index, todo);
        } else return;

    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
        }
        else return;
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
        return todoList;
    }
}