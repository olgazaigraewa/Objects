import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int currentYear = 2022;

        Human maksim = new Human(null, "Минск", 1988, "бренд-менеджер");
        maksim.hello();

        Human anya = new Human("Аня", null, 1993, " методист образовательных программ");
        anya.hello();

        Human katya = new Human("Катя", "Калининград", 0, " продакт-менеджер");
        katya.hello();

        Human artem = new Human("Артём", "Москва", 1995, null);
        artem.hello();

        Human wladimir = new Human("Владимир", "Казань", currentYear - 21, "сейчас нигде не работает");
        wladimir.hello();
        System.out.println(" ");


        Car lada = new Car("Lada", " Granta", 2015, "Россия", "желтый", 1.7);
        lada.setTransmission("МКПП");
        lada.setRegNumber("м256ло459");
        Car audi = new Car(" Audi", " A8 50 L TDI quattro", 2020, "Германия", null, 3.0);
        audi.setSummerTires(true);
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 45_000, "78951236"));
        audi.getInsurance().checkNumber();
        Car bmw = new Car(" BMW", " Z8", 2021, null, "черный", 3.0);
        bmw.setRegNumber("к538во952");
        bmw.setKey(new Car.Key(true, true));
        Car kia = new Car(" Kia", " Sportage 4-го поколения", 2018, "Южная Корея", "красный", 0);
        Car hyundai = new Car(" Hyundai ", " Avante", 0, "Южная Корея", "оранжевый", 1.6);
        hyundai.setSummerTires(true);
        System.out.println(hyundai.isCorrectRegNumber());
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
        System.out.println(" ");

        Flower rosa = new Flower(null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower(null, null, 15.00, 5);
        Flower peony = new Flower(null, "Англия", -69.90, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.50, 10);
        printInfo(rosa);
        printInfo(chrysanthemum);
        printInfo(peony);
        printInfo(gypsophila);
        printCostOfFlowers(rosa, rosa, rosa,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);
    }


    private static void printInfo(Flower flower) {
        System.out.println("Цвет: " + flower.getFlowerColor() + ", страна происхождения: " + flower.getCountry() +
                ", стоимость за штуку: " + flower.getCost() + " рублей , срок стояния: " + flower.lifeSpan + " дней");
    }

    private static Object printCostOfFlowers(Flower... flowers) {
        double costOfBouquet = 0;
        int minimumLifespan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifespan) {
                minimumLifespan = flower.lifeSpan;

            }
            costOfBouquet += flower.getCost();
            printInfo(flower);
        }
        costOfBouquet = costOfBouquet * 1.1;
        System.out.println("Стоимость букета: " + costOfBouquet + " рублей.");
        System.out.println("Срок стояния букета: " + minimumLifespan + " дней.");
        return null;
    }

    private static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуска - " + car.getYear() + ", сборка -  " + car.getCountry() +
                        ",  цвет - " + car.getColor() +
                        ", объем двигателя -  " + car.getEngineVolume() +
                        " литров, коробка передач - " + car.getTransmission() +
                        ", тип кузова - " + car.getTypeOfBody() +
                        ", регистрационный номер - " + car.getRegNumber() +
                        ", количество мест - " + car.getSeatsCount() +
                        " , " + (car.isSummerTires() ? "летняя" : "зимняя") + " резина " +
                        ",  " + (car.getKey().isKeylessAccess() ? "доступ без ключа " : "доступ с ключом") +
                        ",  " + (car.getKey().isRemoteRunEngine() ? "удаленный запуск " : "обычный запуск") +
                        ", номер страховки - " + car.getInsurance().getNumber() +
                        ", стоимость страховки - " + car.getInsurance().getCost() +
                        ", срок действия страховки - " + car.getInsurance().getExpireDate());


    }
}




















