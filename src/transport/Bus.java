package transport;

import java.util.Objects;

public class Bus extends Transport{
    private float priceOfTheTrip;
    private int routeNumber;
    private int seatsCount;
    private double engineVolume;
    private String fuelType;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed,
               float priceOfTheTrip, int routeNumber, int seatsCount, double engineVolume, String fuelType) {
        super(brand,  model, year,  country,  color, maxSpeed);
        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
        this.routeNumber = Math.max(routeNumber, 0);
        this.seatsCount = Math.max(seatsCount, 0);
        if (engineVolume <= 0) {
            this.engineVolume = 5.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
    }

    public float getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(float priceOfTheTrip) {
        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = Math.max(routeNumber, 0);
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = Math.max(seatsCount, 0);
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
        this.fuelType = fuelType;
    }

    @Override
    public void refill() {
        System.out.println("Автобус заправлять бензином или дизелем на заправке.");
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }

    @Override
    public void printInfo() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return Float.compare(bus.getPriceOfTheTrip(), getPriceOfTheTrip()) == 0 && getRouteNumber() == bus.getRouteNumber() &&
                getSeatsCount() == bus.getSeatsCount() && Double.compare(bus.getEngineVolume(), getEngineVolume()) == 0 &&
                getFuelType().equals(bus.getFuelType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPriceOfTheTrip(), getRouteNumber(), getSeatsCount(), getEngineVolume(), getFuelType());
    }
    private static void printInfo(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() +
                ", год выпуска - " + bus.getYear() +
                ", сборка -  " + bus.getCountry() +
                ", цвет - " + bus.getColor() +
                ", скорость передвижения " + bus.getMaxSpeed() +
                ", цена поездки - " + bus.getPriceOfTheTrip() +
                ", номер маршрута - " + bus.getRouteNumber() +
                ", количество мест - " + bus.getSeatsCount() +
                ", объем двигателя - " + bus.getEngineVolume() +
                ", тип топлива - " + bus.getFuelType());

    }
}


