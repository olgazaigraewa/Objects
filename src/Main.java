import transport.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
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

        Train lastochka = new Train("Ласточка", "И-901", 2011, "Россия", null, 301,
                3500f, 0, "Белорусский вокзал", "станция Минск-Пассажирский",
                11, "Дизель");
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270,
                1700f, 0, "Ленинградский вокзал",
                "станция Ленинград-Пассажирский", 8, "Дизель");
        leningrad.printInfo();
        lastochka.printInfo();
        System.out.println(" ");

        Car lada = new Car("Lada", " Granta", 2015, "Россия", "желтый", 0, "Бензин");
        lada.setTransmission("МКПП");
        lada.setRegNumber("м256ло459");
        Car audi = new Car(" Audi", " A8 50 L TDI quattro", 2020, "Германия", null, 3.0, "Бензин");
        audi.setSummerTires(true);
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 45_000, "78951236"));
        audi.getInsurance().checkNumber();
        Car bmw = new Car(" BMW", " Z8", 2021, null, "черный", 3.0, "Бензин");
        bmw.setRegNumber("к538во952");
        bmw.setKey(new Car.Key(true, true));
        Car kia = new Car(" Kia", " Sportage 4-го поколения", 2018, "Южная Корея", "красный", 0, "Бензин");
        Car hyundai = new Car(" Hyundai ", " Avante", 0, "Южная Корея", "оранжевый", 1.6, "Бензин");
        hyundai.setSummerTires(true);
        System.out.println(hyundai.isCorrectRegNumber());
        lada.printInfo();
        audi.printInfo();
        bmw.printInfo();
        kia.printInfo();
        hyundai.printInfo();
        System.out.println(" ");

        Bus mersedes = new Bus("Mersedes", "Citaro", 2019, "Германия", " жёлтый",
                160, 50, 191, 32, 12, "Дизель");
        Bus volvo = new Bus("Volvo", "8900", 2018, "Швеция", " синий",
                160, 50, 27, 57, 7.7, "Дизель");
        Bus man = new Bus("Man", "City", 2020, "Польша", " белый",
                160, 50, 295, 57, 9, "Дизель");
        Bus liaz = new Bus("ЛИАЗ", "5256", 0, null, null,
                0, 0, 0, 0, 11, "Дизель");

        mersedes.printInfo();
        volvo.printInfo();
        man.printInfo();
        liaz.printInfo();
        System.out.println(" ");
        lada.refill();
//        lastochka.refill();
        mersedes.refill();
        System.out.println(" ");

        Trucks ford = new Trucks("Ford", "F-MAX", 0, null, null, 0, 12.7, "Дизель");
        Trucks renault = new Trucks("Renault", "T-Series", 0, null, null, 0, 10.8, "Дизель");
        Trucks daewoo = new Trucks("Daewoo", "Novus SE", 0, null, null, 0, 7.6, "Дизель");
        Trucks kamaz = new Trucks("КАМАЗ", "4308", 0, null, null, 0, 4.5, "Дизель");
        ford.printInfo();
        renault.printInfo();
        daewoo.printInfo();
        kamaz.printInfo();
        System.out.println(" ");


    }


}






















