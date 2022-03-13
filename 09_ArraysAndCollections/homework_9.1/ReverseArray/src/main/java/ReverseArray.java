public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {
        String[] array = strings;
        int length = array.length;
        String temp;

        for (int i = 0; i < length / 2; i++) {
            temp = array[length-i-1];
            array[length-i-1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
