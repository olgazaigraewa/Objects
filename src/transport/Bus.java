package transport;

import lombok.Getter;
import lombok.Setter;


import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
@Getter
@Setter

public class Bus extends Transport implements Competing {
    private Capacity capacity;


    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity){
        super(brand, model, engineVolume);
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        if (engineVolume <= 0) {
            this.engineVolume = 5.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.capacity = capacity;

    }


    public Capacity getCapacity() {
        return capacity;
    }


    @Override
    public void refill() {

    }


    @Override
    public void startMoving() {
        System.out.printf("Автобус %s %s начни движение", this.getBrand(), this.getModel());
    }





    @Override
    public void finishMoving() {
        System.out.printf("Автобус %s %s закончи движение", this.getBrand(), this.getModel());
    }

    @Override
    public void printType() {
        if(capacity==null){
            System.out.println("Данных недостаточно");
        }else {

            System.out.println("вместимость автобуса - " +  getBrand() + " "  + getModel()  + " "  + " от " +
                    capacity.getFrom() + " до " + capacity.getTo() + " мест");
        }
    }


    @Override
    public void pitStop() {
        System.out.printf("Автобус! %s %s Пит-стоп! ", this.getBrand(), this.getModel());
    }

    @Override
    public float bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 15);
    }

    @Override
    public float maximumSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 160);
    }

    @Override
    public void printInfo() {
        System.out.println("Автобус - " + getBrand() +
                ", модель - " + getModel() +
                ", объем двигателя - " + getEngineVolume() + " л.");

    }
}
//    private float priceOfTheTrip;
//    private int routeNumber;
//    private int seatsCount;
//      private double engineVolume;
//    private String fuelType;

//    public Bus(String brand, String model, int year, String country, String color, int maxSpeed,
//               float priceOfTheTrip, int routeNumber, int seatsCount, double engineVolume, String fuelType) {
//        super(brand, model, year, country, color);
//        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
//        this.routeNumber = Math.max(routeNumber, 0);
///        this.seatsCount = Math.max(seatsCount, 0);
//        if (engineVolume <= 0) {
//            this.engineVolume = 5.5;} else {
//            this.engineVolume = engineVolume;
//        }
//        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
//    }
//
//    public float getPriceOfTheTrip() {
//        return priceOfTheTrip;
///    }
///
//    public void setPriceOfTheTrip(float priceOfTheTrip) {
//        this.priceOfTheTrip = Math.max(priceOfTheTrip, 0);
///    }
//
//    public int getRouteNumber() {
//        return routeNumber;
//    }

//    public void setRouteNumber(int routeNumber) {
//        this.routeNumber = Math.max(routeNumber, 0);
//    }

//    public int getSeatsCount() {
//        return seatsCount;
//    }

//    public void setSeatsCount(int seatsCount) {
//        this.seatsCount = Math.max(seatsCount, 0);
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
///    }
///
//    public void setEngineVolume(double engineVolume) {
//     /   if (engineVolume <= 0) {
//            this.engineVolume = 5.5;
//        } else {
//            /this.engineVolume = engineVolume;
//        }
//    }
//
//    public String getFuelType() {
//        return fuelType;
//    }
//
//    public void setFuelType(String fuelType) {
///        this.fuelType = fuelType;
//    }
//
///    @Override
//    public void refill() {
//        System.out.println("Автобус заправлять бензином или дизелем на заправке.");
//    }
//
//    @Override
//    public void startMoving() {
//
///    }
//
///    @Override
//   / public void finishMoving() {
//
//    }
//
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Bus)) return false;
//        Bus bus = (Bus) o;
//        return Float.compare(bus.getPriceOfTheTrip(), getPriceOfTheTrip()) == 0 && getRouteNumber() == bus.getRouteNumber() &&
//                getSeatsCount() == bus.getSeatsCount() && Double.compare(bus.getEngineVolume(), getEngineVolume()) == 0 &&
//                getFuelType().equals(bus.getFuelType());
//    }
///
//    @Override
//    public int hashCode() {
//        return Objects.hash(getPriceOfTheTrip(), getRouteNumber(), getSeatsCount(), getEngineVolume(), getFuelType());
//    }
//    @Ov/erride
//    public void printInfo() {
//        System.out.println(getBrand() + " " +getModel() +
//                ", год выпуска - " +getYear() +
//                ", сборка -  " + getCountry() +
//                ", цвет - " + getColor() +
//                ", скорость передвижения " + getMaxSpeed() +
//                ", цена поездки - " + getPriceOfTheTrip() +
//                ", номер маршрута - " + getRouteNumber() +
//                ", количество мест - " + getSeatsCount() +
//                ", объем двигателя - " + getEngineVolume() +
//                ", тип топлива - " + getFuelType());
//
//    }





