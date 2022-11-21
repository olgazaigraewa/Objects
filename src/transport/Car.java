package transport;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ThreadLocalRandom;
@Getter
@Setter
public class Car extends Transport implements Competing {

    private TypeBody typeBody;

    public Car(String brand,
               String model,
               double engineVolume,
               TypeBody typeBody)
               {
        super(brand, model, engineVolume);
        this.typeBody=typeBody;

    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    @Override
    public void refill() {

    }

    @Override
    public void startMoving() {
        System.out.printf("Автомобиль %s %s начни движение", this.getBrand(),this.getModel());
           }

    @Override
    public void finishMoving() {
        System.out.printf("Автомобиль %s %s закончи движение", this.getBrand(),this.getModel());
         }

    @Override
    public void printType() {
        if (typeBody==null){
            System.out.println("Данных недостаточно");
        }else {
            System.out.println( " тип кузова авто  " + getBrand() + " " + getModel() + " - " + typeBody);
        }

    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль! %s %s Пит-стоп! ", this.getBrand(),this.getModel());
          }

    @Override
    public float bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 30);
    }

    @Override
    public float maximumSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 250);
    }
    @Override
    public void printInfo() {
        System.out.println ("Автомобиль - " + getBrand()+
                ", модель - " + getModel() +
                ", объем двигателя - " + getEngineVolume() + " л.");

    }

}
























