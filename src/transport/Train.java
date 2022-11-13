package transport;

import java.util.Objects;

public class Train extends Transport {
    private float priceOfTheTrip;
    private float timeOfTheTrip;
    private String departureStation;
    private String finalStop;
    private int numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, float priceOfTheTrip,
                 float timeOfTheTrip, String departureStation, String finalStop, int numberOfWagons) {
        super(brand, model, year, country, color, maxSpeed);
        if (priceOfTheTrip > 0) {
        } else {
            this.priceOfTheTrip = Math.abs(priceOfTheTrip);
            this.priceOfTheTrip = priceOfTheTrip;
        }
        if (timeOfTheTrip > 0) {
        } else {
            this.timeOfTheTrip = Math.abs(timeOfTheTrip);
            this.timeOfTheTrip = timeOfTheTrip;
        }
        this.departureStation = Objects.requireNonNullElse(departureStation, "default");
        this.finalStop = Objects.requireNonNullElse(finalStop, "default");
        if (numberOfWagons > 0) {
        } else {
            this.numberOfWagons = Math.abs(numberOfWagons);
            this.numberOfWagons = numberOfWagons;
        }
    }

    public float getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(float priceOfTheTrip) {
        if (priceOfTheTrip > 0) {
        } else {
            this.priceOfTheTrip = Math.abs(priceOfTheTrip);
            this.priceOfTheTrip = priceOfTheTrip;
        }
    }

    public float getTimeOfTheTrip() {
        return timeOfTheTrip;
    }

    public void setTimeOfTheTrip(float timeOfTheTrip) {
        if (timeOfTheTrip > 0) {
        } else {
            this.timeOfTheTrip = Math.abs(timeOfTheTrip);
            this.timeOfTheTrip = timeOfTheTrip;
        }
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
        if (numberOfWagons > 0) {
        } else {
            this.numberOfWagons = Math.abs(numberOfWagons);
            this.numberOfWagons = numberOfWagons;
        }

    }


    @Override
    public String toString() {
        return getBrand() + " " + getModel() +
                ", год выпуска - " + getYear() +
                ", сборка -  " + getCountry() +
                ",  цвет - " + getColor() +
                ",  скорость передвижения " + getMaxSpeed() +
                ", цена поездки - " + getPriceOfTheTrip() +
                ", время поездки - " + getTimeOfTheTrip() +
                ",станция отправления - " + getDepartureStation() +
                ", конечная остановка - " + getFinalStop() +
                ", количество вагонов - " + getNumberOfWagons();
    }

}







