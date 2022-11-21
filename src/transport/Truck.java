package transport;


import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ThreadLocalRandom;

@Getter
@Setter
public class Truck extends Transport implements Competing {
    private Tonnage tonnage;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 Tonnage tonnage) {
        super(brand, model, engineVolume);
        this.tonnage = tonnage;

    }

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void refill() {

    }


    @Override
    public void startMoving() {
        System.out.printf("Грузовик %s %s начни движение", this.getBrand(), this.getModel());
    }

    @Override
    public void finishMoving() {
        System.out.printf("Грузовик %s %s закончи движение", this.getBrand(), this.getModel());
    }

    @Override
    public void printType() {
        if(tonnage==null){
            System.out.println("Данных недостаточно");
        }else {
            String from = tonnage.getFrom()==null? " " : " от " + tonnage.getFrom()  + " " ;
            String to = tonnage.getTo() ==null? " " : " до " + tonnage.getTo();
            System.out.println("грузоподъемность авто - " + getBrand() + " "  +  getModel() +  from   + to + " т.");
        }

    }


    @Override
    public void pitStop() {
        System.out.printf("Грузовик! %s %s Пит-стоп! ", this.getBrand(), this.getModel());
    }

    @Override
    public float bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 24);
    }

    @Override
    public float maximumSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 150);
    }

    @Override
    public void printInfo() {
        System.out.println("Грузовик - " + getBrand() +
                ", модель - " + getModel() +
                ", объем двигателя - " + getEngineVolume() + " л.");
    }
}


// /   public Trucks(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String fuelType) {
//        super(brand, model, year, country, color);
//    /    if (engineVolume <= 0) {
//            this.engineVolume = 5.5;
//        } else {
//           / this.engineVolume = engineVolume;
//        }
//        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume <= 0) {
///            this.engineVolume = 5.5;
//        } else {
//     /       this.engineVolume = engineVolume;
//        /}
//    }

//    public String getFuelType() {
//        return fuelType;
//    }
//
//    public void setFuelType(String fuelType) {
//        this.fuelType = Objects.requireNonNullElse(fuelType, "default");
//    }
//
//    @Override
//    public boolean equals(Object o) {
///       if (this == o) return true;
//        if (!(o instanceof Trucks)) return false;
//        Trucks trucks = (Trucks) o;
//        return Double.compare(trucks.getEngineVolume(), getEngineVolume()) == 0 && getFuelType().equals(trucks.getFuelType());
//   }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getEngineVolume(), getFuelType());
//    }
//
///    @Override
//    public String toString() {
//        return "Грузовик:" +
//                ", объем двигателя - " + engineVolume;
//
//    }
//
//    @Override
//    public void printInfo() {
//
///        System.out.println(getBrand() + " " + getModel() +
//                ", год выпуска - " + getYear() +
//                ", сборка -  " + getCountry() +
//                ",  цвет - " + getColor() +
///                ",  скорость передвижения " + getMaxSpeed() +
//                ", объем двигателя - " + engineVolume +
//                ", тип топлива - " + fuelType);
//    }




