package Driver;

import lombok.Getter;
import lombok.Setter;
import transport.Car;



@Setter
@Getter
public class DriverB extends Driver<Car>{

    public DriverB(String fullName, String driverscategory, int drivingExperience, String car) {
        super(fullName, "В" , drivingExperience, car);


    }

    @Override
    public void startMoving() {
        System.out.printf("Водителю легкового автомобиля %s начать движение", this.getFullName());
                this.getCar().startMoving();
    }

    @Override
    public void finishMoving() {
        System.out.printf("Водителю легкового автомобиля %s закончить движение", this.getFullName());
                this.getCar().finishMoving();
    }

    @Override
    public void refill() {
        System.out.printf("Водителю легкового автомобиля %s заправить автомобиль %s %s", this.getFullName(),
                this.getCar().getBrand(),this.getCar().getModel());
    }

    @Override
    public void getIn(Car transport) {
        System.out.println("Водитель " + getFullName() + "управляет легковым автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }




    }



