public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7,
                "жёлтый", 2015, "Россия",
                200, null, "седан",
                null, 4, true,
                null, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3,
                "черный", 2020, "Германия", 200,
                null, "седан", null, 3, false,
                null, null);
        Train martin = new Train("Ласточка", "B-901", 2011, "Россия",
                null, 301, 3500, 2, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, 1700, -1, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        Bus cursor = new Bus("Курсор", "ЛиАЗ-4292", 2015,"Россия", null, 85);
        Bus maz = new Bus(null, "МАЗ-203", 2006, "Белорусь", null, 90);

        System.out.println(lada);
        lada.refill();
        System.out.println(martin);
        martin.refill();
        System.out.println(cursor);
        cursor.refill();

        Herbivores horse = new Herbivores("Лошадь", 3, "Россия", 4, "трава");
        Herbivores giraffe = new Herbivores("Жираф", 5, "Африка", 10, "плоды");
        Herbivores gazelle = new Herbivores("Газель", 2, "степь", 6, "трава");

        System.out.println(horse);
        System.out.println(giraffe);
        System.out.println(gazelle);

        Predators hyena = new Predators("Гиена", 6, "Африка", 4, "мясо");
        Predators tiger = new Predators("Тигр", 4, "Китай", 9, "мясо");
        Predators bear = new Predators("Медведь", 3, "Россия", 7, "мясо");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        Amphibians frog = new Amphibians("Лягушка", 1, "Россия");
        Amphibians waterSnake = new Amphibians("Уж пресноводный", 2, "Южная Европа");

        System.out.println(frog);
        System.out.println(waterSnake);

        FlightlessBirds peacock = new FlightlessBirds("Павлин", 3, "джунгли", "пешком");
        FlightlessBirds penguin = new FlightlessBirds("Пингвин", 2, "Южное полушарие", "пешком");
        FlightlessBirds dodoBird = new FlightlessBirds("Додо", 1, "засушливые леса", "пешком");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

        FlyingBirds gull = new FlyingBirds("Чайка", 1, "Арктика", "крылья");
        FlyingBirds albatross = new FlyingBirds("Альбатрос", 2, "Южный океан", "крылья");
        FlyingBirds falcon = new FlyingBirds("Сокол", 2, "повсеместно", "крылья");

        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);


    }
}