import java.time.LocalDate;

public class Car extends Transport {
    private final double engineDisplacement;
    public String transmission;
    private final String bodyType;
    public String registrationNumber;
    private final int numberOfSeats;
    public boolean winterTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineDisplacement, String colour, Integer yearProduction, String assemblyCountry, Integer maxSpeed, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean winterTires, Key key, Insurance insurance) {
        super(brand, model, yearProduction, assemblyCountry, colour, maxSpeed);

        this.engineDisplacement = engineDisplacement;

        if (registrationNumber == null || registrationNumber.length() != 9) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (this.key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (this.insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.numberOfSeats = numberOfSeats;
        this.bodyType = bodyType;

    }


    public double getEngineDisplacement(){
        return engineDisplacement;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "механическая";
        } else {
            this.transmission = transmission;
        }
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void changeTires(){
        winterTires = !winterTires;
    }

    public boolean numCorrect() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key(){
            this (true, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expiry;
        private final double inscost;
        private final String number;

        public Insurance(LocalDate expiry, double inscost, String number) {
            if (expiry == null){
                this.expiry = LocalDate.now().plusYears(2);
            } else {
                this.expiry = expiry;
            }
            this.inscost = inscost;
            if (number == null){
                this.number = "254649268";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(LocalDate.now(), 3950, "127080694");
        }

        public void checkInsuranceNumber(){
            if (number.length() != 9){
                System.out.println("Некорректный номер страховки");
            }
        }

        public void expiryChecking(){
            if (expiry.isBefore(LocalDate.now()) || expiry.isEqual(LocalDate.now())){
                System.out.println("Необходимо срочно оформить страховку!");
            }
        }

        public LocalDate getExpiry() {
            return expiry;
        }

        public double getInscost() {
            return inscost;
        }

        public String getNumber() {
            return number;
        }

    }

    @Override
    public void refill() {
        System.out.println("заправка: бензином");
    }

    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() + " " + getModel() + ", \n" +
                "объем двигателя: " + getEngineDisplacement() + ", \n" +
                "цвет: " + getColour() + ", \n" +
                "год производства: " + getYearProduction() + ", \n" +
                "страна производства: " + getAssemblyCountry() + ", \n" +
                "максимальная скорость: " + getMaxSpeed() + "км/ч, \n" +
                "коробка передач: " + getTransmission() + ", \n" +
                "тип кузова: " + getBodyType() + ", \n" +
                "регистрационный номер:" + getRegistrationNumber() + ", \n" +
                "количество мест: " + getNumberOfSeats() + ", \n" +
                "зимние шины: " + getWinterTires() + ", \n" +
                "ключ: " + getKey().keylessAccess + ", " + getKey().remoteEngineStart + ", \n" +
                "страховка: " + getInsurance().number + ", " + getInsurance().inscost + ", " + getInsurance().expiry + ", ";
    }
}
