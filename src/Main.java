
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import transport.*;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada", " Granta", 1.7, TypeBody.SEDAN);
        Car audi = new Car(" Audi", " A8 50 L TDI quattro", 3.0, TypeBody.CRASSOVER);
        Car bmw = new Car(" BMW", " Z8", 3.0, TypeBody.COUPE);
        Car hyundai = new Car("Hyundai", " Avante", 1.6, TypeBody.SEDAN);
        lada.printInfo();
        audi.printInfo();
        bmw.printInfo();
        hyundai.printInfo();
        System.out.println(" ");

        Truck ford = new Truck("Ford", "F-MAX", 12.7, Tonnage.N3);
        Truck renault = new Truck("Renault", "T-Series", 10.8, null);
        Truck daewoo = new Truck("Daewoo", "Novus SE", 7.6, Tonnage.N2);
        Truck kamaz = new Truck("КАМАЗ", "4308", 4.5, Tonnage.N1);
        ford.printInfo();
        renault.printInfo();
        daewoo.printInfo();
        kamaz.printInfo();
        System.out.println(" ");

        Bus mersedes = new Bus("Mersedes", "Citaro", 12, Capacity.SUPER_LARGE);
        Bus volvo = new Bus("Volvo", "8900", 7.7, Capacity.SMALL);
        Bus man = new Bus("Man", "City", 9, Capacity.MEDIUM);
        Bus liaz = new Bus("ЛИАЗ", "5256", 11, Capacity.LARGE);
        mersedes.printInfo();
        volvo.printInfo();
        man.printInfo();
        liaz.printInfo();
        System.out.println(" ");

        DriverB driverB = new DriverB("Иванов Иван Иванович ", "В", 10, " bmw ");
        DriverC driverC = new DriverC("Иванов Дмитрий Сергеевич ", "C", 15, " ford ");
        DriverD driverD = new DriverD("Денисов Игорь Иванович ", "D", 17, " man ");

        driverB.getIn(new Car(audi.getBrand(), audi.getModel(), audi.getEngineVolume(), audi.getTypeBody()));
        driverC.getIn(new Truck(ford.getBrand(), ford.getModel(), ford.getEngineVolume(),ford.getTonnage()));
        driverD.getIn(new Bus(man.getBrand(), man.getModel(), man.getEngineVolume(), man.getCapacity()));
        System.out.println(" ");

        lada.printType();
        audi.printType();
        bmw.printType();
        ford.printType();
        kamaz.printType();
        renault.printType();
        volvo.printType();
        man.printType();


    }
}
//        int currentYear = 2022;

    //       Human maksim = new Human(null, "Минск", 1988, "бренд-менеджер");
    //       maksim.hello();

    //       Human anya = new Human("Аня", null, 1993, " методист образовательных программ");
    //       anya.hello();

    //       Human katya = new Human("Катя", "Калининград", 0, " продакт-менеджер");katya.hello();

//        Human artem = new Human("Артём", "Москва", 1995, null);
    //       artem.hello();

//        Human wladimir = new Human("Владимир", "Казань", currentYear - 21, "сейчас нигде не работает");
    //       wladimir.hello();
//        System.out.println(" ");

//        Flower rosa = new Flower(null, "Голландия", 35.59, 0);
//        Flower chrysanthemum = new Flower(null, null, 15.00, 5);
//        Flower peony = new Flower(null, "Англия", -69.90, 1);
//        Flower gypsophila = new Flower(null, "Турция", 19.50, 10);

//        Flower.printCostOfFlowers(rosa, rosa, rosa,
//                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
//                gypsophila);
//        System.out.println(" ");






























