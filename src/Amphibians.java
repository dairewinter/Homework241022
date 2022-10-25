public class Amphibians extends Animals {
    private final String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = Validation.validOrDefault(livingEnvironment, "тропики");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
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

    public void hunt() {
        System.out.println("Охотятся на насекомых и беспозвоночных");
    }

    @Override
    public String toString() {
        return "Земноводное: " + getName() + ", \n" +
                "возраст: " + getAge() + ", \n" +
                "место обитания: " + getLivingEnvironment() + "\n";
    }
}
