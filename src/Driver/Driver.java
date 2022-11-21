package Driver;

import lombok.Getter;
import lombok.Setter;
import transport.Transport;
@Getter
@Setter
public abstract class Driver<T extends Transport > {
    private  String fullName;
    private String driverscategory;
    private int drivingExperience;
    private T car;

    public Driver(String fullName, String driverscategory, int drivingExperience, String car) {
        this.fullName = fullName;
        this.driverscategory = driverscategory;
        this.drivingExperience = drivingExperience;


    }

    public abstract void startMoving();
    public abstract void finishMoving ();
    public abstract void refill();
    public abstract void getIn(T transport);

    public String getFullName() {
        return fullName;
    }

    public T getCar() {
        return car;
    }

    @Override
    public String toString() {
         return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }


}



