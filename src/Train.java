public class Train extends Transport {
    int travelPrice;
    int travelTime;
    String nameOfDepartureStation;
    String finalStop;
    int wagonNum;

    public Train(String brand, String model, int yearProduction,
                 String assemblyCountry, String colour, int maxSpeed,
                 int travelPrice, int travelTime, String nameOfDepartureStation,
                 String finalStop, int wagonNum) {
        super(brand, model, yearProduction, assemblyCountry, colour, maxSpeed);
        this.travelPrice = Math.max(travelPrice, 1000);
        this.travelTime = Math.max(travelTime, 1);
        this.nameOfDepartureStation = Validation.validOrDefault(nameOfDepartureStation, "Белорусский вокзал");
        this.finalStop = Validation.validOrDefault(finalStop, "Белорусский вокзал");
        this.wagonNum = wagonNum;
    }

    public int getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(int travelPrice) {
        this.travelPrice = Math.max(travelPrice, 1000);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 1);
    }

    public String getNameOfDepartureStation() {
        return nameOfDepartureStation;
    }

    public void setNameOfDepartureStation(String nameOfDepartureStation) {
        this.nameOfDepartureStation = Validation.validOrDefault(nameOfDepartureStation, "Белорусский вокзал");
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = Validation.validOrDefault(finalStop, "Белорусский вокзал");
    }

    public int getWagonNum() {
        return wagonNum;
    }

    public void setWagonNum(int wagonNum) {
        this.wagonNum = wagonNum;
    }

    @Override
    public void refill() {
        System.out.println("заправка: дизелем");
    }

    @Override
    public String toString() {
        return "Поезд: " + getBrand() + " " + getModel() + ", \n" +
                "год производства: " + getYearProduction() + ", \n" +
                "страна производства: " + getAssemblyCountry() + ", \n" +
                "цвет: " + getColour() + ", \n" +
                "максимальная скорость: " + getMaxSpeed() + "км/ч, \n" +
                "цена поездки: " + getTravelPrice() + ", \n" +
                "время поездки: " + getTravelTime() + ", \n" +
                "Станция отбытия: " + getNameOfDepartureStation() + ", \n" +
                "конечная остановка: " + getFinalStop() + ", \n" +
                "количество вагонов: " + getWagonNum() + ", ";

    }
}
