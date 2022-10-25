public class Predators extends Mammals{
    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = Validation.validOrDefault(typeOfFood, "мясо");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = Validation.validOrDefault(typeOfFood, "мясо");
    }

    @Override
    public void walk() {
        System.out.println("Гуляют в лесу");
    }

    public void hunt(){
        System.out.println("Охотятся в лесу");
    }

    @Override
    public String toString() {
        return "Хищное: " + getName() + ", \n" +
                "возраст: " + getAge() + ", \n" +
                "место обитания: " + getLivingEnvironment() + ", \n" +
                "скорость передвижения: " + getMovementSpeed() + ", \n" +
                "тип пищи: " + getTypeOfFood() + ", ";
    }
}
