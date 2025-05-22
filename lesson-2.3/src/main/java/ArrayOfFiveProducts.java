class ArrayOfFiveProducts {
    public static void main(String[] args) {
        // Объявлние массива объектов
        Product[] productsArray = new Product[5];

        // Заполняем массив товарами
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 14", "15.09.2023", "Apple Inc.", "USA", 999, false);
        productsArray[2] = new Product("Xiaomi Mi 11", "01.03.2021", "Xiaomi", "China", 499, false);
        productsArray[3] = new Product("Google Pixel 6", "28.10.2021", "Google inc.", "USA", 599, true);
        productsArray[4] = new Product("OnePlus 9", "23.03.2021", "OnePlus", "China", 729, false);

        // Вывод информации о каждом товаре
        for (Product product : productsArray) {
            product.displayInfo();
        }
    }
}

