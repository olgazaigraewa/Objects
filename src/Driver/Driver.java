package Driver;

import lombok.Getter;
import lombok.Setter;
import transport.Transport;

import java.util.Objects;

@Getter
@Setter
public abstract class Driver<T extends Transport > {
    private  String fullName;
    private String driverscategory;
    private int drivingExperience;
    private T car;

    public Driver(String fullName, String driverscategory, int drivingExperience, String car) {
        this.fullName = fullName;
        setDriverscategory(driverscategory);
        this.drivingExperience = drivingExperience;


    }

    public void setDriverscategory(String driverscategory) {
        if (driverscategory==null){
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.driverscategory = driverscategory;
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
        return  fullName +   ", категория - " + driverscategory + ", стаж вождения - " + drivingExperience;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null|| getClass()!= o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return Objects.equals(fullName, driver.fullName) &&
                Objects.equals(driverscategory, driver.driverscategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverscategory);
    }
}



