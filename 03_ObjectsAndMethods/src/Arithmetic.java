public class Arithmetic {

    private int quantity = 0;
    private int overPrice = 0;

    public Arithmetic() {
        this.quantity = quantity;
        this.overPrice = overPrice;
    }

    public int calculateSum(int quantity, int overPrice) {

        int i = quantity + overPrice;

        System.out.println("Сумма: " + i);

        return i;
    }

    public int calculateMulti(int quantity, int overPrice) {

        int i = quantity * overPrice;

        System.out.println("Произведение: " + i + "\n");

        return i;
    }

    public void calculateMax(int quantity, int overPrice) {
        int a = quantity;
        int b = overPrice;
        int large = 0;

        large = Math.max(a, b);

        System.out.println("Расчет максимального и минимального значений:");
        System.out.println(large + " - " + "Наибольшее число");
         }

    public void calculateMin(int quantity, int overPrice) {
        int a = quantity;
        int b = overPrice;

        int small = 0;

        small = Math.min(a, b);

        System.out.println("Расчет максимального и минимального значений:");
        System.out.println(small + " - " + "Наименьшее число");
    }

}
