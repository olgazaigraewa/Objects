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

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        super(brand,  model, year,  country,  color);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.key = Objects.requireNonNullElseGet(key, Key::new);
        this.insurance = Objects.requireNonNullElseGet(insurance, Insurance::new);

        this.transmission = "АКПП";
        this.typeOfBody = "седан";
        this.regNumber = "x000xx000";
        this.seatsCount = 5;
        this.summerTires = false;

    }


    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume) {
        this(brand, model, year, country, color, engineVolume)  ;
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
        this.summerTires = Objects.requireNonNullElse(summerTires, true);
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

    @Override
    public void refill() {
        System.out.println("Автомобиль заправлять бензином, дизелем на заправке или заряжать на специальных электро-парковках, если это электрокар.");
    }


    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean keylessAccess;

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


}



















