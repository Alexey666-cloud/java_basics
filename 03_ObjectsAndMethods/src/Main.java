public class Main {

    public static void main(String[] args) {
        Basket zinaBasket = new Basket();
        zinaBasket.add("Молоко", 40, 0.9);
        zinaBasket.add("Сыр", 120, 0.650);

        Basket genaBasket = new Basket();
        genaBasket.add("Розетка", 160, 0.50);
        genaBasket.add("Изолента", 20, 0.10);

        zinaBasket.print("\nКорзина Зины");
        genaBasket.print("\nКорзина Гены");

        Printer firstPrinter = new Printer();
        firstPrinter.append("Молоко", "Продукты", 1);
        firstPrinter.append("Сыр", "Продукты", 2);
        firstPrinter.clear();

        firstPrinter.print("\nНакладная 1");

        Printer secondPrinter = new Printer();
        secondPrinter.append("Розетка", "Электрика", 1);
        secondPrinter.append("Изолента", "Расходные материалы", 3);

        secondPrinter.print("\nНакладная 2");

        Arithmetic calculate = new Arithmetic();
        calculate.calculateSum(6, 6);
        calculate.calculateMulti(6, 6);
        calculate.calculateMax(56, 66);
        calculate.calculateMin(56, 66);
      }
}
