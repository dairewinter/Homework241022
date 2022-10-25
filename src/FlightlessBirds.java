public class FlightlessBirds extends Birds{
    private final String movementType;

    public FlightlessBirds(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = Validation.validOrDefault(movementType, "пешком");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void hunt() {
        System.out.println("Охотятся на рыбу");
    }

    public void walk(){
        System.out.println("Гуляют пешком");
    }

    @Override
    public String toString() {
        return "Травоядное: " + getName() + ", \n" +
                "возраст: " + getAge() + ", \n" +
                "место обитания: " + getLivingEnvironment() + ", \n" +
                "тип передвижения: " + getMovementType();
    }
}
