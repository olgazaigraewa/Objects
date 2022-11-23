package transport;




import Driver.Driver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class  Transport {
    String brand;
    String model;
    double engineVolume;
    private final List<Driver<?>>drivers = new ArrayList<>();
    private final List<Mechanic<?>>mechanics = new ArrayList<>();
    private  final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume ) {
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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriverB(Driver<?>...drivers ) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
        public void addDriverC(Driver<?>...drivers ) {
            this.drivers.addAll(Arrays.asList(drivers));
        }
            public void addDriverD(Driver<?>...drivers ) {
                this.drivers.addAll(Arrays.asList(drivers));
            }

    public void addMechanic(Mechanic<?>...mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor...sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void refill();

    public abstract void printInfo();
    public abstract void startMoving();

    public abstract void finishMoving();
    public abstract void printType();
    public abstract boolean service();
    public abstract void repair();

}












