import java.util.*;

public class PhoneBook {
    String key = "";
    String value = "";

    TreeMap<String, String> phoneBook = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента

        if (!name.equals(phone) && !phone.equals(name)) {
            key = name;
            value = phone;
            phoneBook.put(key, value);
        }
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
        if (phoneBook.containsKey(name) && phoneBook.containsValue(value)) {
            return Collections.singleton(name + " - " + phoneBook.get(name));
        }
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet

        if (!phoneBook.containsKey(key) && !phoneBook.containsValue(value) && !phoneBook.isEmpty()) {
            for (Map.Entry<String, String> contactList : phoneBook.entrySet()) {
                return new TreeSet<String>(Set.of(contactList.getKey() + " - " + contactList.getValue()));
            }
        }
            for (Map.Entry<String, String> twoPhone : phoneBook.entrySet()) {
                if (value == twoPhone.getValue() && phoneBook.size() > 1) {
                    return Collections.singleton(key + " - " + twoPhone.getValue());
                }
            }
        return new TreeSet<>();
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
//    private static void getMap(Map<String, String> map) {
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//           String key = entry.getKey(); // получения ключа
//           String value = entry.getValue(); // получения ключа
//        }
//        System.out.println(key + " - " + value);
//    }
}