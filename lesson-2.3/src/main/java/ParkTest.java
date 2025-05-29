// Пример использования класса Park
public class ParkTest {
    public static void main(String[] args) {
        Park amusementPark = new Park("Луна-парк", 3);
        amusementPark.addAttraction(0, "Американские горки", "10:00 - 22:00", 5.0);
        amusementPark.addAttraction(1, "Колесо обозрения", "10:00 - 20:00", 3.0);
        amusementPark.addAttraction(2, "Поездка на поезде", "10:00 - 21:00", 2.5);

        amusementPark.displayAttractions();
    }
}