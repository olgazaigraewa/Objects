package Driver;

import lombok.Getter;
import lombok.Setter;
import transport.Bus;


@Getter
@Setter
public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, String driverscategory, int drivingExperience, String car) {
        super(fullName, "D", drivingExperience, car);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водителю автобуса %s начать движение", this.getFullName());
        this.getCar().startMoving();
    }

    @Override
    public void finishMoving() {
        System.out.printf("Водителю автобуса %s закончить движение", this.getFullName());
        this.getCar().finishMoving();
    }

    @Override
    public void refill() {
        System.out.printf("Водителю автобуса %s заправить автомобиль %s %s", this.getFullName(),
                this.getCar().getBrand(), this.getCar().getModel());
    }

    @Override
    public void getIn(Bus transport) {
        System.out.println("Водитель " + getFullName() + " управляет автобусом " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }


}







