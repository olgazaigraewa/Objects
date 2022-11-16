package transport;

import java.util.Objects;

public class Train extends Transport {
    private float priceOfTheTrip;
    private float timeOfTheTrip;
    private String departureStation;
    private String finalStop;
    private int numberOfWagons;
    private String fuelType;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, float priceOfTheTrip,
                 float timeOfTheTrip, String departureStation, String finalStop, int numberOfWagons, String fuelType) {
        super(brand, model, year, country, color);
        this.timeOfTheTrip = Math.max(timeOfTheTrip, 0);
        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
        this.departureStation = Objects.requireNonNullElse(departureStation, "default");
        this.finalStop = Objects.requireNonNullElse(finalStop, "default");
        this.numberOfWagons = Math.max(numberOfWagons, 0);
        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
    }

    public float getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(float priceOfTheTrip) {
        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
    }

    public float getTimeOfTheTrip() {
        return timeOfTheTrip;
    }

    public void setTimeOfTheTrip(float timeOfTheTrip) {
        this.timeOfTheTrip = Math.max(timeOfTheTrip, 0);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = Objects.requireNonNullElse(departureStation, "default");
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = Objects.requireNonNullElse(finalStop, "default");
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = Math.max(numberOfWagons, 0);

    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
    }

    @Override
    public void refill() {
        System.out.println("Поезд заправлять дизелем.");
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
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return Float.compare(train.getPriceOfTheTrip(), getPriceOfTheTrip()) == 0 && Float.compare(train.getTimeOfTheTrip(),
                getTimeOfTheTrip()) == 0 && getNumberOfWagons() == train.getNumberOfWagons() &&
                getDepartureStation().equals(train.getDepartureStation()) && getFinalStop().equals(train.getFinalStop()) &&
                getFuelType().equals(train.getFuelType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPriceOfTheTrip(), getTimeOfTheTrip(), getDepartureStation(), getFinalStop(),
                getNumberOfWagons(), getFuelType());
    }

    @Override
    public void printInfo() {
        System.out.println(getBrand() + " " + getModel() +
                ", год выпуска - " + getYear() +
                ", сборка -  " + getCountry() +
                ",  цвет - " + getColor() +
                ",  скорость передвижения " + getMaxSpeed() +
                ", цена поездки - " + getPriceOfTheTrip() +
                ", время поездки - " + getTimeOfTheTrip() +
                ",станция отправления - " + getDepartureStation() +
                ", конечная остановка - " + getFinalStop() +
                ", количество вагонов - " + getNumberOfWagons() +
                ", тип топлива - " + getFuelType());
    }

    }









