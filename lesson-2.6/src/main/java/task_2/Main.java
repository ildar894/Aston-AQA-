package task_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи в телефонный справочник
        phoneBook.add("Иванов", "+7(999)111-11-11");
        phoneBook.add("Иванов", "+7(999)222-22-22");
        phoneBook.add("Петров", "+7(933)333-33-33");
        phoneBook.add("Сидоров", "+7(944)444-44-44");

        // Получаем номера телефонов по фамилии
        System.out.println("Номера телефонов для Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов для Петров: " + phoneBook.get("Петров"));
        System.out.println("Номера телефонов для Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Номера телефонов для Смирнов: " + phoneBook.get("Смирнов")); // Не существует

        // Печатаем все записи
        System.out.println("\nВсе записи в телефонном справочнике:");
        phoneBook.printAll();
    }
}