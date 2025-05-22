class Park {
    private String name; // Название парка
    private Attraction[] attractions; // Массив аттракционов

    // Конструктор
    public Park(String name, int numberOfAttractions) {
        this.name = name;
        this.attractions = new Attraction[numberOfAttractions];
    }

    // Внутренний класс Attraction
    class Attraction {
        private String attractionName; // Название аттракциона
        private String workingHours; // Время работы
        private double price; // Стоимость

        // Конструктор внутреннего класса
        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void displayAttractionInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
            System.out.println();
        }
    }

    // Метод для добавления аттракциона
    public void addAttraction(int index, String name, String hours, double price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, hours, price);
        }
    }

    // Метод для вывода информации обо всех аттракционах
    public void displayAttractions() {
        System.out.println("Аттракционы в парке " + name + ":");
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.displayAttractionInfo();
            }
        }
    }
}