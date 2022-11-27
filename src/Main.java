
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;

import org.jetbrains.annotations.NotNull;
import transport.*;

import java.util.List;
import java.util.Set;

@NotNull
public class Main {

    public static void main(String[] args) {

        Mechanic<Car> semyon = new Mechanic<Car>("Семён", "Семёнов", "Pirelli");
        Sponsor lukoil = new Sponsor("Лукойл", 3_000_000);
        Sponsor michelin = new Sponsor("Michelin", 2_000_000);
        System.out.println(" ");
        Car car = new Car("Lada", " Granta", 1.7, TypeBody.SEDAN);
        car.addDriverB(new DriverB("Рыжков Павел Иванович", "В", 20, "lada"));
        car.addMechanic(semyon);
        car.addSponsor(lukoil, michelin);
        System.out.println(" ");
        Mechanic<Car> igor = new Mechanic<Car>("Игорь", "Иванов", "Pirelli");
        Sponsor gazprom = new Sponsor("Gazprom", 5_000_000);
        System.out.println(" ");
        Car car1 = new Car(" Audi", " A8 50 L TDI quattro", 3.0, TypeBody.CRASSOVER);
        car1.addDriverB(new DriverB("Громов Петр Алексеевич", "В", 12, "audi"));
        car1.addMechanic(igor);
        car1.addSponsor(gazprom);
        System.out.println(" ");
        Mechanic<Car> anton = new Mechanic<Car>("Антон", "Антонов", "Pirelli");
        Sponsor ostin = new Sponsor("Ostin", 3_000_000);
        Sponsor patanin = new Sponsor("Пaтанин", 2_000_000);
        System.out.println(" ");
        Car car2 = new Car(" BMW", " Z8", 3.0, TypeBody.COUPE);
        car2.addDriverB(new DriverB("Гришин Иван Иванович ", "В", 10, " bmw "));
        car2.addMechanic(semyon);
        car2.addSponsor(lukoil, patanin);
        System.out.println(" ");
        Mechanic<Car> mikhail = new Mechanic<Car>("Михаил ", "Орлов", "Pirelli");
        Sponsor park = new Sponsor("Park", 5_000_000);
        System.out.println(" ");
        Car car3 = new Car("Hyundai", " Avante", 1.6, TypeBody.SEDAN);
        car3.addDriverB(new DriverB("Шипин Егор Дмитриевич ", "В", 13, " hyundai"));
        car3.addMechanic(mikhail);
        car3.addSponsor(gazprom);
        System.out.println(" ");

        Mechanic<Truck> yuri = new Mechanic<Truck>("Юрий ", "Зимин", "Pirelli");
        Sponsor temp = new Sponsor("Temp", 5_000_000);
        System.out.println(" ");
        Truck truck = new Truck("Ford", "F-MAX", 12.7, Tonnage.N3);
        truck.addDriverC(new DriverC("Иванов Дмитрий Сергеевич ", "C", 15, " ford "));
        truck.addMechanic(yuri);
        truck.addSponsor(gazprom);
        System.out.println(" ");
        Mechanic<Truck> petr = new Mechanic<Truck>("Петр ", "Арбенин", "Pirelli");
        Sponsor igora = new Sponsor("Igora", 2_000_000);
        Sponsor andronidze = new Sponsor("Андронидзе", 2_000_000);
        System.out.println(" ");
        Truck truck1 = new Truck("Renault", "T-Series", 10.8, null);
        truck1.addDriverC(new DriverC("Андреев Андрей Андреевич", "С", 18, "renault"));
        truck1.addMechanic(petr);
        truck1.addSponsor(gazprom, andronidze);
        Mechanic<Truck> oleg = new Mechanic<Truck>("Олег ", "Башкатов", "Pirelli");
        Sponsor osin = new Sponsor("Осин", 5_000_000);
        System.out.println(" ");
        Truck truck2 = new Truck("Daewoo", "Novus SE", 7.6, Tonnage.N2);
        truck2.addDriverC(new DriverC("Куликов Артем Львович", "С", 10, "daewoo"));
        truck2.addMechanic(oleg);
        truck2.addSponsor(osin);
        Mechanic<Truck> vlad = new Mechanic<Truck>("Влад ", "Дибров", "Pirelli");
        Sponsor gamma = new Sponsor("Gamma", 2_000_000);
        Sponsor orion = new Sponsor("Orion", 2_000_000);
        System.out.println(" ");
        Truck truck3 = new Truck("КАМАЗ", "4308", 4.5, Tonnage.N1);
        truck3.addDriverC(new DriverC("Квят Даниил Николаевич", "С", 12, "kamaz"));
        truck3.addMechanic(vlad);
        truck3.addSponsor(gamma, orion);

        System.out.println(" ");
        Mechanic<Bus> gleb = new Mechanic<Bus>("Глеб ", "Яковлев", "Pirelli");
        Sponsor condor = new Sponsor("Condor", 4_000_000);
        System.out.println(" ");
        Bus bus = new Bus("Mersedes", "Citaro", 12, Capacity.SUPER_LARGE);
        bus.addDriverD(new DriverD("Павлов Аркадий Глебович", "D", 13, "mersedes"));
        bus.addDriverD(new DriverD("Павлов Аркадий Глебович", "D", 13, "mersedes"));
        bus.addMechanic(gleb);
        bus.addMechanic(gleb);
        bus.addSponsor(condor);
        bus.addSponsor(condor);
        System.out.println(" ");
        Mechanic<Bus> zurab = new Mechanic<Bus>("Зураб", "Зурабов", "Pirelli");
        Sponsor oil = new Sponsor("Oil", 4_000_000);
        System.out.println(" ");
        Bus bus1= new Bus("Volvo", "8900", 7.7, Capacity.SMALL);
        bus1.addDriverD(new DriverD("Окуджава Георгий Михайлович", "D", 15, "volvo"));
        bus1.addMechanic(zurab);
        bus1.addSponsor(oil);
        System.out.println(" ");
        Mechanic<Bus> ignat = new Mechanic<Bus>("Игнат", "Петров", "Pirelli");
        Sponsor ellipse = new Sponsor("Ellipse", 4_000_000);
        System.out.println(" ");
        Bus bus2= new Bus("Man", "City", 9, Capacity.MEDIUM);
        bus2.addDriverD(new DriverD("Озеров Анатолий Владимирович", "D", 15, " man"));
        bus2.addMechanic(ignat);
        bus2.addSponsor(ellipse);
        System.out.println(" ");
        Mechanic<Bus> maks = new Mechanic<Bus>("Макс", "Максимов", "Pirelli");
        Sponsor square = new Sponsor("Square", 5_000_000);
        System.out.println(" ");
        Bus bus3 = new Bus("ЛИАЗ", "5256", 11, Capacity.LARGE);
        bus3.addDriverD(new DriverD("Денисов Игорь Иванович ", "D", 17, " man "));
        bus3.addMechanic(maks);
        bus3.addSponsor(square);
        System.out.println(" ");
       /* DriverB driverB = new DriverB("Гришин Иван Иванович ", "В", 10, " bmw ");
        DriverC driverC = new DriverC("Иванов Дмитрий Сергеевич ", "C", 15, " ford ");
        DriverD driverD = new DriverD("Денисов Игорь Иванович ", "D", 17, " man ");

        driverB.getIn(new Car(audi.getBrand(), audi.getModel(), audi.getEngineVolume(), audi.getTypeBody()));
        driverC.getIn(new Truck(ford.getBrand(), ford.getModel(), ford.getEngineVolume(), ford.getTonnage()));
        driverD.getIn(new Bus(man.getBrand(), man.getModel(), man.getEngineVolume(), man.getCapacity()));
        System.out.println(" ");*/
        service(bus, bus1, bus2, bus3, car, car1, car2, car3,truck, truck1, truck2, truck3);
        List<Transport> transports = List.of( car, car1, car2, car3, bus, bus1, bus2, bus3,
                truck, truck1, truck2, truck3);
        Set<Transport>transports1 = Set.of(car, car1, car2, car3, bus, bus1, bus2, bus3,
                truck, truck1, truck2, truck3);






        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(car);
        serviceStation.addTruck(truck);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            printInfo(transport);
        }
    }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());


    }
     private static void service(Transport... transports) {
     for (Transport transport : transports) {
         if (!transport.service())
             try {
                 throw new RuntimeException(" Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику.");
             } catch (RuntimeException e) {
                 System.out.println(e.getMessage());
             }

         }
     }
}






       /* lada.printInfo();
        audi.printInfo();
        bmw.printInfo();
        hyundai.printInfo();*/
        /*  ford.printInfo();
        renault.printInfo();
        daewoo.printInfo();
        kamaz.printInfo();*/
       /* lada.printType();
        audi.printType();
        bmw.printType();
        ford.printType();
        kamaz.printType();
        renault.printType();
        volvo.printType();
        man.printType();
        System.out.println(" ");*/
        /* mersedes.printInfo();
        volvo.printInfo();
        man.printInfo();
        liaz.printInfo();*/





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






























