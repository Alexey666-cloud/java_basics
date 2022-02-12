package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Basket zinaBasket = new Basket();
        zinaBasket.add("Молоко", 40, 0.9);
        zinaBasket.add("Сыр", 120, 0.650);

        Basket genaBasket = new Basket();
        genaBasket.add("Розетка", 160, 0.50);
        genaBasket.add("Изолента", 20, 0.10);

        Basket valeraBasket = new Basket();
        valeraBasket.add("Пила", 670, 1.5);
        valeraBasket.add("Ведро", 250, 0.300);

        Basket borisBasket = new Basket();
        borisBasket.add("Цемент", 450, 50.0);
        borisBasket.add("Грунтовка", 350, 2.5);

        Basket ignatBasket = new Basket();
        ignatBasket.add("Мальберт", 3500, 1.5);
        ignatBasket.add("Акварель", 600, 0.25);

        zinaBasket.print("\nКорзина Зины");
        genaBasket.print("\nКорзина Гены");
        valeraBasket.print("\nКорзина Валеры");
        borisBasket.print("\nКорзина Бори");
        ignatBasket.print("\nКорзина Игната");

        System.out.println("\nВсего " + Basket.basketCount + " корзин покупателей");
        System.out.println("Сумма заказа: " + Basket.calcOrderPrice() + " руб");
        System.out.println("Общее колличество товаров: " + Basket.calcOrderCount() + " шт");
        System.out.println("Средняя цена товаров: " + Basket.calcAveragePrice() + " руб");
        System.out.println("Средняя стоимость корзины: " + Basket.calcAverageBasket() + " руб");
      }
}

