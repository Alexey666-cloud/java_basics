import java.util.*;

public class PhoneBook {

    public static String key = "";
    public static String value = "";

    public static TreeMap<String, String> phoneBook = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        key = name;
        value = phone;

        phoneBook.put(key, value);
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phone)) {
                return entry.getKey() + " - " + entry.getValue();
            }
        }
        return "";
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        if (phoneBook.containsKey(key)) {
            return Collections.singleton(name + " - " + phoneBook.get(name));
        }
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        if (!phoneBook.containsKey(key) && !phoneBook.isEmpty()) {
            return new TreeSet<String>(Set.of(key + " - " + value));
        }
        if (phoneBook.size() > 3 && !phoneBook.containsKey(value) && !phoneBook.isEmpty()) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                return Collections.singleton(key + " - " + entry.getValue() + ", " + phoneBook.get(key));
            }
        }
        return new TreeSet<>();
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    private static void getMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            key = entry.getKey(); // получения ключа
            value = entry.getValue(); // получения ключа
        }
        System.out.println(key + " - " + value);
    }
}