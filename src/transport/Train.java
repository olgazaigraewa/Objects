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
        this.timeOfTheTrip = Math.max(timeOfTheTrip, 0);
        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
        this.departureStation = Objects.requireNonNullElse(departureStation, "default");
        this.finalStop = Objects.requireNonNullElse(finalStop, "default");
        this.numberOfWagons = Math.max(numberOfWagons, 0);
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


    @Override
    public void refill() {
        System.out.println("Поезд заправлять дизелем.");
    }
}







