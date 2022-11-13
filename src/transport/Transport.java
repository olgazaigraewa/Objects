package transport;

import java.util.Objects;

public class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = Objects.requireNonNullElse(country, "default");
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = Math.abs(maxSpeed);
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {

    }

    public void transport(String s) {
        System.out.println(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = Math.abs(maxSpeed);
            this.maxSpeed = maxSpeed;
        }
    }

    public static void printInfo(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() +
                ", год выпуска - " + transport.getYear() +
                ", сборка -  " + transport.getCountry() +
                ",  цвет - " + transport.getColor() +
                ",  скорость передвижения " +
                transport.getMaxSpeed());
    }
}






