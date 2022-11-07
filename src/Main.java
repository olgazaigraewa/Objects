public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(null, "Минск", 1988, "бренд-менеджер");
        maksim.hello();

        Human anya = new Human("Аня",null, 1993, " методист образовательных программ");
        anya.hello();

        Human katya = new Human("Катя", "Калининград", 0, " продакт-менеджер");
        katya.hello();

        Human artem = new Human("Артём", "Москва",1995, null);
        artem.hello();


        Car lada = new Car(null, " Granta", 2015, "Россия", "желтый", 1.7);
        System.out.println(lada);
        Car audi = new Car(" Audi", " A8 50 L TDI quattro", 2020,"Германия", null, 3.0);
        System.out.println(audi);
        Car bmw = new Car(" BMW"," Z8", 2021, null,"черный",3.0);
        System.out.println(bmw);
        Car kia = new Car(" Kia", " Sportage 4-го поколения", 2018, "Южная Корея","красный", 0 );
        System.out.println(kia);
        Car hyundai = new Car(" Hyundai ", " Avante", 0, "Южная Корея", "оранжевый", 1.6);
        System.out.println(hyundai);



    }
}