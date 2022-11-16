package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String typeOfBody;
    private String regNumber;
    private int seatsCount;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;
    private String fuelType;

    public Car(String brand, String model, int year, String country, String color, double engineVolume, String fuelType ) {
        super(brand, model, year, country, color);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.key = Objects.requireNonNullElseGet(null, Key::new);
        this.insurance = Objects.requireNonNullElseGet(null, Insurance::new);

        this.transmission = "АКПП";
        this.typeOfBody = "седан";
        this.regNumber = "x000xx000";
        this.seatsCount = 5;
        this.summerTires = false;
        this.fuelType = Objects.requireNonNullElse(fuelType, "default");

    }

    public Car(String brand, String model, int year, String country, String color, int maxSpeed,
               double engineVolume, String fuelType) {
        this(brand, model, year, country, color, engineVolume, fuelType);
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = Objects.requireNonNullElse(transmission, "АКПП");
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = Objects.requireNonNullElse(regNumber, "x000xx000");
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = Objects.requireNonNullElse(summerTires, false);
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = Objects.requireNonNullElse(typeOfBody, "седан");
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = Objects.requireNonNullElse(seatsCount, 5);
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
    }

    public void changeTires() {
        summerTires = !summerTires;
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

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) && !Character.isAlphabetic(chars[4]) && !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class Insurance {
        private LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            }
            this.cost = Objects.requireNonNullElse(cost, 0.00);
            this.number = Objects.requireNonNullElse(number, "123456789");
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
    public static class Key {
        private boolean remoteRunEngine;
        private boolean keylessAccess;

        public Key(boolean remoteRunEngine, boolean keylessAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public void isRemoteRunEngine(boolean remoteRunEngine) {
            this.remoteRunEngine = remoteRunEngine;
        }

        public void isKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }
    }


    @Override
    public void refill() {
        System.out.println("Автомобиль заправлять бензином, дизелем на заправке " +
                "или заряжать на специальных электро-парковках, если это электрокар.");
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getEngineVolume(), getEngineVolume()) == 0 && getSeatsCount() == car.getSeatsCount() &&
                isSummerTires() == car.isSummerTires() && getTransmission().equals(car.getTransmission()) &&
                getTypeOfBody().equals(car.getTypeOfBody()) && getRegNumber().equals(car.getRegNumber()) &&
                getKey().equals(car.getKey()) && getInsurance().equals(car.getInsurance()) && getFuelType().equals(car.getFuelType());
    }


    @Override
        public int hashCode() {
            return Objects.hash(getEngineVolume(), getTransmission(), getTypeOfBody(), getRegNumber(), getSeatsCount(),
                    isSummerTires(), getKey(), getInsurance(), getFuelType());
    }

    @Override
        public void printInfo() {
        System.out.println(getBrand() + " " + getModel() +
                ", год выпуска - " + getYear() +
                ", сборка -  " + getCountry() +
                ",  цвет - " + getColor() +
                ", объем двигателя -  " + getEngineVolume() +
                " литров, коробка передач - " + getTransmission() +
                ", тип кузова - " + getTypeOfBody() +
                ", регистрационный номер - " + getRegNumber() +
                ", количество мест - " + getSeatsCount() +
                " , " + (isSummerTires() ? "летняя" : "зимняя") + " резина " +
                ",  " + (getKey().isKeylessAccess() ? "доступ без ключа " : "доступ с ключом") +
                ",  " + (getKey().isRemoteRunEngine() ? "удаленный запуск " : "обычный запуск") +
                ", номер страховки - " + getInsurance().getNumber() +
                ", стоимость страховки - " + getInsurance().getCost() +
                ", срок действия страховки - " + getInsurance().getExpireDate() +
                ", тип топлива - " + getFuelType());
    }




    }





















