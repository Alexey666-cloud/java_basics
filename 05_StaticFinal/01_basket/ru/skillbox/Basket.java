package ru.skillbox;

public class Basket {

    private static int orderPrice = 0;
    private static int orderCount = 0;
    public static int basketCount = 0;
    private static int averagePrice = 0;
    private static int averageBasket = 0;
    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;

    public Basket() {
        increaseCount(1);
        basketCount = basketCount + 1;
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public static int calcOrderPrice() {
        orderPrice = totalPrice;
        return orderPrice;
    }

    public static int calcOrderCount() {
        orderCount = Basket.count + count;
        return orderCount;
    }

    public static int calcAveragePrice() {
        averagePrice = totalPrice / Basket.count;
        return averagePrice;
    }

    public static int calcAverageBasket() {
        averageBasket = totalPrice / basketCount;
        return averageBasket;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price, double totalWeight) {
        add(name, price, totalWeight, 1);
    }

    public void add(String name, int price, double totalWeight, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price + " руб.  вес: " + totalWeight + " кг";
        totalPrice = totalPrice + count * price;
        this.totalWeight = totalWeight * count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
/*
Что нужно сделать
Внесите следующие изменения в класс Basket:

Добавьте две статические переменные для хранения общей стоимости и общего количества всех товаров во всех корзинах.
Реализуйте статические методы, которые будут увеличивать значения этих переменных при добавлении в корзину новых товаров.
Реализуйте статический метод расчёта средней цены товара во всех корзинах. Он должен рассчитывать и возвращать отношение общей стоимости всех корзин к общему количеству всех товаров.
Реализуйте статический метод расчёта средней стоимости корзины (отношение общей стоимости всех корзин к количеству корзин).
Названия переменных и методов придумайте самостоятельно.
 */
