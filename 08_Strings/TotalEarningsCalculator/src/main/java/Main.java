public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String sum = "";
        int sumSalary = 0;

        for (int x = 0; x < text.length(); x++) {
            char symbol = text.charAt(x);
            if(Character.isDigit(symbol)) {
                int end = text.indexOf(' ', x);
                sum += text.substring(x, end);
                sumSalary = sumSalary + Integer.parseInt(sum);
                x += (end - x);
            } else {
                sum = "";
            }
        }
        System.out.println(sumSalary);
    }

}