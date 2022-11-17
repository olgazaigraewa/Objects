package transport;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter

public abstract class  Transport {
    private String brand;
    private String model;
//    private int year;
//   private String country;
//    private String color;
//    private int maxSpeed;
    private double engineVolume;




//    public abstract void refill();

    public abstract void startMoving ();

    public abstract void finishMoving ();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        if (engineVolume <= 0) {
            this.engineVolume = 5.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

//    public Transport(String brand, String model, int year, String country, String color) {
//        this.brand = Objects.requireNonNullElse(brand, "default");
//        this.model = Objects.requireNonNullElse(model, "default");
//        if (year <= 0) {
//            this.year = 2000;
//        } else {
//            this.year = year;
//        }
//        this.country = Objects.requireNonNullElse(country, "default");
//        if (color == null) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//        this.maxSpeed = Math.max(maxSpeed, 0);


//    public Transport() {
//        this.brand = Objects.requireNonNullElse(brand, "default");
//        this.model = Objects.requireNonNullElse(model, "default");
//        if (year <= 0) {
//            this.year = 2000;
//        } else {
//            this.year = year;
//        }
//        this.country = Objects.requireNonNullElse(country, "default");
//        if (color == null) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//        this.maxSpeed = Math.max(maxSpeed, 0);
//    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {return country;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
 //   }

//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = Math.max(maxSpeed, 0);
//    }

    public  abstract void printInfo();

}






