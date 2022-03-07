public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {
        String[] array666 = new String[strings.length];
        int z = 0;

        for (int i = strings.length - 1; i >= 0; i--) {
            array666[z++] = strings[i];
        }
        return array666;
    }
}
