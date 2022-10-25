public abstract class Mammals extends Animals{
    private final String livingEnvironment;
    private final int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = Validation.validOrDefault(livingEnvironment, "тропики");
        this.movementSpeed = movementSpeed;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    public abstract void walk();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

}
