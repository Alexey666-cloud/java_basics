public class Printer {

    private String queue;
    private int totalPendingPages = 0;
    private int totalPrintedCount = 0;

    public Printer() {
        queue = "Список товаров: ";
    }

    public void append(String name, String type, int pagesCount) {

        queue = queue + name + "\n" + "Категория товара: " +
                type + "\n" + "Колличество страниц: " + pagesCount + "\n";
        totalPrintedCount = totalPrintedCount + pagesCount;
        totalPendingPages = 0;
    }

    public void clear() {
        queue = "";
        totalPrintedCount = totalPrintedCount + totalPendingPages;
        totalPendingPages = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("Печать завершена: " + totalPrintedCount + " стр.");
        } else {
            System.out.println(queue + "\n" + "Страниц в очереди: " + totalPrintedCount + " стр." + "\n");
        }
    }
}
