public class Bus extends Transport{
    public Bus(String brand, String model, int yearProduction, String assemblyCountry, String colour, int maxSpeed) {
        super(brand, model, yearProduction, assemblyCountry, colour, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("заправка: бензином/дизелем");
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() + " " + getModel() + ", \n" +
                "год производства: " + getYearProduction() + ", \n" +
                "страна производства: " + getAssemblyCountry() + ", \n" +
                "цвет: " + getColour() + ", \n" +
                "максимальная скорость: " + getMaxSpeed() + " км/ч, ";
    }
}
