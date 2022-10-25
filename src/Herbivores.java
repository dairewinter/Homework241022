public class Herbivores extends Mammals {
    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = Validation.validOrDefault(typeOfFood, "трава");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = Validation.validOrDefault(typeOfFood, "трава");
    }

    @Override
    public void walk() {
        System.out.println("Гуляет в поле");
    }

    public void pasture(){
        System.out.println("Пасется в поле");
    }

    @Override
    public String toString() {
        return "Травоядное: " + getName() + ", \n" +
                "возраст: " + getAge() + ", \n" +
                "место обитания: " + getLivingEnvironment() + ", \n" +
                "скорость передвижения: " + getMovementSpeed() + ", \n" +
                "тип пищи: " + getTypeOfFood() + ", ";
    }
}
