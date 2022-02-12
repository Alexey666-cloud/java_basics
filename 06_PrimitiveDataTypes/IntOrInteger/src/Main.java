public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (int i = 1040; i < 1104; i++) {
            char a = (char) i;
            System.out.println(a);
        }

        System.out.println("Дополнительные буквы: " + (char) 1025 + " " + (char) 1105);
    }
}
