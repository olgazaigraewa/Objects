package Driver;

import lombok.Getter;
import lombok.Setter;

import transport.Truck;

@Getter
@Setter

public class DriverC extends Driver<Truck>{
    public DriverC(String fullName, String driverscategory, int drivingExperience, String car) {
        super(fullName, "C", drivingExperience, car);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водителю грузового автомобиля %s начать движение", this.getFullName());
        this.getCar().startMoving();
    }

    @Override
    public void finishMoving() {
        System.out.printf("Водителю грузового автомобиля %s закончить движение", this.getFullName());
        this.getCar().finishMoving() ;
    }

    @Override
    public void refill() {
        System.out.printf("Водителю грузового автомобиля %s заправить автомобиль %s %s", this.getFullName(),
                this.getCar().getBrand(),this.getCar().getModel());
    }

    @Override
    public void getIn(Truck transport) {
        System.out.println("Водитель " + getFullName() + "управляет грузовым автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }
}