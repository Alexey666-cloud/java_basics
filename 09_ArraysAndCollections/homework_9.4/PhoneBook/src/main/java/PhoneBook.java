import java.util.*;

public class PhoneBook {

    TreeMap<String, String> phoneBook = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента

        for (Map.Entry<String, String> numb : phoneBook.entrySet()) {
            if (phoneBook.containsValue(numb.getValue() == phone)) {
                phoneBook.remove(numb.getKey());
            }
        }
        if (!name.equals(phone) && !phone.equals(name)) {
            phoneBook.put(name, phone);
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
        if (phoneBook.containsKey(name)) {
            return Collections.singleton(name + " - " + phoneBook.get(name));
        }
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet

        for (Map.Entry<String, String> contactList : phoneBook.entrySet()) {
//            if (phoneBook.size() >= 2
//                    && phoneBook.containsKey(contactList.getKey()) == phoneBook.containsKey(contactList.getKey())
//                    && !contactList.getKey().isEmpty()
//                    && !contactList.getValue().isEmpty()) {
//                return new TreeSet<String>(Set.of(contactList.getKey()
//                        + " - " + contactList.getValue()
//                        + ", " + contactList.getValue()));
//            }
            if (!contactList.getKey().isEmpty() && !contactList.getValue().isEmpty()) {
                return new TreeSet<>(Set.of(contactList.getKey()
                        + " - " + contactList.getValue()));
            }
        }
        return new TreeSet<>();
    }
}