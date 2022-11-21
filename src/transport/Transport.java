package transport;

import java.util.Objects;

public abstract class  Transport {
    String brand;
    String model;
    double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        if (engineVolume <= 0) {
            this.engineVolume = 5.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void refill();

    public abstract void printInfo();
    public abstract void startMoving();

    public abstract void finishMoving();
    public abstract void printType();

}









