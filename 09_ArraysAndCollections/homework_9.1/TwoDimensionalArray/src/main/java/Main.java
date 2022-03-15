public class Main {
    public static void main(String[] args) {
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив

        char[][] array = TwoDimensionalArray.getTwoDimensionalArray(7);
        for (char[] strings : array) {
            for (char string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}

