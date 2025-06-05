public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        Cat catMurzik = new Cat();
        dogBobik.run(150);
        dogBobik.swim(5);

        catMurzik.run(50);
        catMurzik.swim(5);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat();
        cats[1] = new Cat();
        cats[2] = new Cat();

        FoodBowl bowl = new FoodBowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 10); // Коты пытаются поесть по 10 единиц еды
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + " сыт: " + cats[i].isFull());
        }

        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
    }
}