public class GeometryCalculator {

    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double square;
        square = Math.PI * Math.pow(radius, 2.0d);
        return square; //S=πr2 – это произведение числа пи на квадрат радиуса
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return Math.abs((4 * Math.PI * Math.pow(radius, 3.0d)) / 3.0d);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        System.out.println("\nПлощадь треугольника: ");
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }


    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a,b,c)) return -1;
        double p = (a + b + c) / 2.0d;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
