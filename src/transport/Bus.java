package transport;

public class Bus extends Transport{
    private float priceOfTheTrip;
    private int routeNumber;
    private int seatsCount;

    public  void printInfo(){
        System.out.println();
    }

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed,
               float priceOfTheTrip, int routeNumber, int seatsCount) {
        super(brand,  model, year,  country,  color, maxSpeed);
        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
        this.routeNumber = Math.max(routeNumber, 0);
        this.seatsCount = Math.max(seatsCount, 0);
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

    @Override
    public void refill() {
        System.out.println("Автобус заправлять бензином или дизелем на заправке.");
    }
}


