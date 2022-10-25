public abstract class Transport {

    private final String brand;
    private final String model;
    private final int yearProduction;
    private final String assemblyCountry;
    private String colour;
    private int maxSpeed;



    public Transport(String brand, String model, int yearProduction, String assemblyCountry, String colour, int maxSpeed) {
        this.brand = Validation.validOrDefault(brand, "default");
        this.model = Validation.validOrDefault(model, "default");
        this.yearProduction = Math.max(yearProduction, 2000);
        this.assemblyCountry = Validation.validOrDefault(assemblyCountry, "default");
        this.colour = Validation.validOrDefault(colour, "белый");
        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public int getYearProduction() {
        return yearProduction;
    }


    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = Validation.validOrDefault(colour, "белый");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
