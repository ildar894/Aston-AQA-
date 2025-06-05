package task_2;

import java.util.*;

public class PhoneBook {
    // Хранит фамилии и соответствующие им номера телефонов
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        // Если фамилия уже есть, добавляем номер в список
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для получения номеров телефонов по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    // Метод для печати всех записей в справочнике (для удобства)
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Номера: " + entry.getValue());
        }
    }
}
