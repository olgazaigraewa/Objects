public class Car {

    private final String brand;
    public final String model;
    private final int year;
    private final String country;
    private final String color;
    private final double engineVolume;


    @Override
    public String toString() {
        return "Автомобиль: марка  - " + brand + ", модель - " + model + ",  " + year + " года выпуска, сборка -  " + country + ",  цвет - " + color + ", объем двигателя -  " + engineVolume + " литров.";
    }

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
}
