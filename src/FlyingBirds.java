public class FlyingBirds extends Birds{
    private final String movementType;

    public FlyingBirds(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = Validation.validOrDefault(movementType, "на крыльях");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void hunt() {
        System.out.println("Охотятся на млекопитающих");
    }

    public void fly(){
        System.out.println("Летают");
    }

    @Override
    public String toString() {
        return "Травоядное: " + getName() + ", \n" +
                "возраст: " + getAge() + ", \n" +
                "место обитания: " + getLivingEnvironment() + ", \n" +
                "тип передвижения: " + getMovementType();
    }
}
