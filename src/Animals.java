public abstract class Animals {
    private String name;
    private final int age;

    public Animals(String name, int age) {
        this.name = Validation.validOrDefault(name, "животное");
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Validation.validOrDefault(name, "неопознанное животное");
    }

    public int getAge() {
        return age;
    }


    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    }

