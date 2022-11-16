package transport;

import java.util.Objects;

public class Trucks extends Transport {
    private double engineVolume;
    private String fuelType;


    @Override
    public void refill() {

    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }


    public Trucks(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String fuelType) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 5.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 5.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trucks)) return false;
        Trucks trucks = (Trucks) o;
        return Double.compare(trucks.getEngineVolume(), getEngineVolume()) == 0 && getFuelType().equals(trucks.getFuelType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngineVolume(), getFuelType());
    }

    @Override
    public String toString() {
        return "Грузовик:" +
                ", объем двигателя - " + engineVolume;

    }

    @Override
    public void printInfo() {

        System.out.println(getBrand() + " " + getModel() +
                ", год выпуска - " + getYear() +
                ", сборка -  " + getCountry() +
                ",  цвет - " + getColor() +
                ",  скорость передвижения " + getMaxSpeed() +
                ", объем двигателя - " + engineVolume +
                ", тип топлива - " + fuelType);
    }


}

